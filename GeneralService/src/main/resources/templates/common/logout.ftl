<#macro logout>
<form action="/login?logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <button type="submit">Выйти</button>
</form>
</#macro>