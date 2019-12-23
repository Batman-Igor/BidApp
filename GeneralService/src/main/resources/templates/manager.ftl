<#import "common/general.ftl" as gen>
<#import "common/userMenu.ftl" as menu>

<@menu.userMenu/>
<@gen.g>
    <hr>
    <table class="manager-table">
        <tr>
            <th scope="col">Title</th>
            <th scope="col">Data</th>
            <th scope="col">Creation date</th>
            <th scope="col">Status</th>
            <th scope="col">Deny bid</th>
            <th scope="col">Approve bid</th>
        </tr>
        <#list bids >
            <#items as bid>
            <tr>
                <td class="manager-td">${bid.title}</td>
                <td class="manager-td">${bid.data}</td>
                <td class="manager-td">${bid.dateOfCreation}</td>
                <td class="manager-td">${bid.status}</td>
                <td class="manager-td">
                    <form action="/update" method="post" class="manager-form">
                        <input type="hidden" name="title" value="${bid.title}"/>
                        <input type="hidden" name="data" value="${bid.data}"/>
                        <input type="hidden" name="email" value="${bid.email}"/>
                        <input type="hidden" name="date" value="${bid.dateOfCreation}"/>
                        <input type="hidden" name="status" value="DENIED"/>
                        <button type="submit" class="btn btn-danger btn-lg manager-deny">Deny</button>
                    </form>
                </td>
                <td class="manager-td">
                    <form action="/update" method="post" class="manager-form">
                        <input type="hidden" name="title" value="${bid.title}"/>
                        <input type="hidden" name="data" value="${bid.data}"/>
                        <input type="hidden" name="email" value="${bid.email}"/>
                        <input type="hidden" name="date" value="${bid.dateOfCreation}"/>
                        <input type="hidden" name="status" value="APPROVED"/>
                        <button type="submit" class="btn btn-success btn-lg manager-approve">Approve</button>
                    </form>
                </td>
            </#items>
        </#list>
    </table>
    <hr>
</@gen.g>