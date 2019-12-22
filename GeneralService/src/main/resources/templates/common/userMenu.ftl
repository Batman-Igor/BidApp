<#import "logout.ftl" as lgt>

<#macro userMenu>
<div class="row">
    <div class="col-md-12">
        <nav class="navbar navbar-dark bg-dark">
            <div>
                <img class="myLogoImg" src="../images/uYjInVHH_400x400.jpg" width="30" height="30"
                     alt="">
                <span class="text-white">${name}</span>
            </div>
            <a class="navbar-brand">Huawei Example Project</a>
            <div class="btn-group dropleft">
                <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown"
                        aria-haspopup="true" aria-expanded="false">
                    Menu
                </button>
                <div class="dropdown-menu">
                    <p class="dropdown-item">
                        <@lgt.logout/>
                    </p>
                </div>
            </div>
        </nav>
    </div>
</div>
</#macro>