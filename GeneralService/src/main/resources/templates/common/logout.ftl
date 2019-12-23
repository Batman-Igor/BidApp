<#macro logout>
<form action="/login?logout" method="post" class="logout-form">
    <#--<input type="hidden" name="_csrf" value="${_csrf.token}">-->
    <button type="submit" class="btn btn-primary btn-lg btn-block logout-button">Log out</button>
</form>
</#macro>