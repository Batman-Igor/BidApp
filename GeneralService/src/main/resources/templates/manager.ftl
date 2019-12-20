<#import "common/general.ftl" as gen>
<#import "common/logout.ftl" as lgt>

<@gen.g>
<p>Hello, ${name}</p>
<p>User role: ${role}</p>
    <@lgt.logout/>
</@gen.g>