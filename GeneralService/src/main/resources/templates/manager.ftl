<#import "common/general.ftl" as gen>
<#import "common/logout.ftl" as lgt>

<@gen.g>
    <p>Hello, ${name}</p>
    <p>User role: ${role}</p>
    <hr>
    <table style="border-collapse: collapse;">
        <#list bids >
                <#items as bid>
                    <tr>
                        <td style="border: 1px solid black">${bid.title}</td>
                        <td style="border: 1px solid black">${bid.data}</td>
                        <td style="border: 1px solid black">${bid.dateOfCreation}</td>
                        <td style="border: 1px solid black">${bid.status}</td>
                        <td style="border: 1px solid black">
                            <form action="/update" method="post">
                                <input type="hidden" name="title" value="${bid.title}"/>
                                <input type="hidden" name="date" value="${bid.dateOfCreation}"/>
                                <input type="hidden" name="status" value="Denny"/>
                                <button type="submit">Denny</button>
                            </form>
                        </td>
                        <td style="border: 1px solid black">
                            <form action="/update" method="post">
                                <input type="hidden" name="title" value="${bid.title}"/>
                                <input type="hidden" name="date" value="${bid.dateOfCreation}"/>
                                <input type="hidden" name="status" value="Approve"/>
                                <button type="submit">Approve</button>
                            </form>
                        </td>
                </#items>
        </#list>
    </table>
    <hr>
    <@lgt.logout/>
</@gen.g>