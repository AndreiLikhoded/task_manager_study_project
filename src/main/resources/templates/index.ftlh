<#import "partials/layout.ftlh" as layout/>

<@layout.renderWith>
    <div class="row">
        <#list calendar.days as day>

            <div class="card col-md-2 col-sm-3" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title"><a href="/day/${day.id}">${day.dayOfMonth}</a></h5>
                    <div class="row">
                        <#list day.tasks as task>
                            <#if task.type?lower_case == "new">
                                <div class="card-link"
                                   style="width: 30px; height: 30px; background-color: aqua; border:1px solid #000; margin: 5px;"></div>
                            <#elseif task.type?lower_case == "in progress">
                                <div class="card-link"
                                   style="width: 30px; height: 30px; background-color: green; border:1px solid #000; margin: 5px;"></div>
                            <#else>
                                <div class="card-link"
                                   style="width: 30px; height: 30px; background-color: red; border:1px solid #000; margin: 5px;"></div>
                            </#if>
                        </#list>
                    </div>
                </div>
            </div>

        </#list>
    </div>
</@layout.renderWith>