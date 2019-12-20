<#import "common/general.ftl" as gen>
<#import "common/logout.ftl" as lgt>

<@gen.g>
    <p>Hello, ${name}</p>
    <p>User role: ${role}</p>
    <hr>
        <#list bids as bid>
        <p>${bid}</p>
        <#else>
        <p>No bids</p>
        </#list>
    <hr>
    <@lgt.logout/>
</@gen.g>