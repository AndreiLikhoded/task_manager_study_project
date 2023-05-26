<#import "partials/layout.ftlh" as layout/>

<@layout.renderWith>

    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Description</th>
        </tr>
        </thead>
        <tfoot>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Description</th>
            <th scope="col">Action</th>
        </tr>
        </tfoot>
        <tbody>
        <#list day.itemDtos as task>
            <tr>
                <th>${task.name}</th>
                <td>${task.description}</td>
                <td>
                    <form action="/day/task/?taskId=${task.id}&dayId=${day.id}">
                        <input type="submit" value="Delete">
                    </form></td>
            </tr>
        </#list>
        </tbody>
    </table>

</@layout.renderWith>