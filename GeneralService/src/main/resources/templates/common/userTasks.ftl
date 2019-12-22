<#macro userTasks>
<div class="col-md-7 ">

    <table class="table table-striped table-dark myTable">
        <caption class="bg-secondary text-white ">
            <div class="row">
                <div class="col-md-1 "></div>
                <div class="col-md-3 ">
                    <small>Bids: ${total}</small>
                </div>

                <div class="col-md-3">
                    <small>Approved: ${approved}</small>
                </div>

                <div class="col-md-3">
                    <small>Denied: ${denied}</small>
                </div>

            </div>
        </caption>
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">Task</th>
            <th scope="col">Creation date</th>
            <th scope="col">Status</th>
        </tr>
        </thead>
        <#list bids>
            <#items as bid>
            <tr>
                <th scope="row">${bid_index + 1}</th>
                <td>${bid.title}</td>
                <td>${bid.dateOfCreation}</td>
                <td>${bid.status}</td>
            </#items>
        </#list>
    </table>
</div>
</#macro>