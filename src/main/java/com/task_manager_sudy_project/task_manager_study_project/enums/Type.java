package com.task_manager_sudy_project.task_manager_study_project.enums;

public enum Type {
    NEW("new"),
    IN_PROGRESS("in progress"),
    DONE("done");

    private String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
