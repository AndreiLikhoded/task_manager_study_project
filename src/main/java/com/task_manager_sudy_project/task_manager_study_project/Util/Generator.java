package com.example.todolist.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Generator {
    private static final List<String> loremWords = new ArrayList<>();

    private static final Random r = new Random();

    private static Generator instance;

    private Generator() {
        loremWords.addAll(prepareLorem());
        loremWords.removeIf(String::isBlank);
        loremWords.removeIf(String::isEmpty);
    }

    public static Generator getInstance() {
        if(instance == null){
            instance = new Generator();
        }
        return instance;
    }

    private List<String> prepareLorem() {
        try {
            var rawLorem = Files.readString(Paths.get("data/lorem.txt"));
            return Arrays.stream(rawLorem.split("\\s"))
                    .map(String::toLowerCase)
                    .map(String::strip)
                    .distinct().toList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }

    public String makeDescription() {
        return makeGibberish(20, 10);
    }

    private String makeGibberish(int randomAmount, int min) {
        if (randomAmount <= 0) {
            randomAmount = 1;
        }

        var wordCount = r.nextInt(randomAmount)+min;
        if (wordCount < 1) {
            wordCount = 1;
        }
        var gibberish = Stream.generate(Generator::takeOneWord).limit(wordCount).collect(Collectors.joining(" ")).strip();
        gibberish = Character.toUpperCase(gibberish.charAt(0)) + gibberish.substring(1);
        if (gibberish.endsWith(",")) {
            gibberish = gibberish.substring(0, gibberish.length() - 2);
        }
        return  gibberish.endsWith(".") ? gibberish : gibberish + ".";
    }

    public String makeName() {
        return makeGibberish(3,2);
    }

    private static String takeOneWord() {
        return loremWords.get(r.nextInt(loremWords.size()));
    }

    static final Pattern removeExtra = Pattern.compile("[.,;]+?");
    public String makeEmail() {
        var prefix = removeExtra.matcher(makeGibberish(2,0)).replaceAll("").toLowerCase();
        var suffix = removeExtra.matcher(makeGibberish(2,0)).replaceAll("").toLowerCase();
        var email =  prefix + "@" + suffix;
        return email.replace(" ", "");
    }

    public String makePassword() {
        return removeExtra.matcher(makeGibberish(0,1))
                .replaceAll("")
                .replace(" ", "");
    }
}
