<#import "common/general.ftl" as gen>
<#import "common/logout.ftl" as lgt>

<@gen.g>
    <p>Hello, ${name}</p>
    <p>User role: ${role}</p>

    <p>Create Bid</p>
    <form method="post" action="/send">
        <input type="text" name="title" placeholder="title">
        <input type="text" name="data" placeholder="data">
        <input type="submit" value="Send">
    </form>

    <hr>
    <#list bids as bid>
        <p>${bid}</p>
    <#else>
        <p>No bids</p>
    </#list>
    <hr>

    <@lgt.logout/>
</@gen.g>