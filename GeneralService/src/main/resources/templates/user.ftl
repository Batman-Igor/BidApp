<#import "common/general.ftl" as gen>
<#import "common/userMenu.ftl" as umenu>
<#import "common/userInfo.ftl" as uinfo>
<#import "common/userTasks.ftl" as utasks>
<#import "common/userModal.ftl" as umodal>

<@gen.g>
д
<div style="overflow: hidden;">
    <@umenu.userMenu/>
    <br>
    <@uinfo.userInfo/>
    <@utasks.userTasks/>
</div>

<@umodal.modal/>


<#--<script src=" https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>-->
<script src="../js/script.js"></script>
</@gen.g>