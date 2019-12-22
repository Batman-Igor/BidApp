<#import "common/general.ftl" as gen>

<@gen.g>
<div class="container d-flex justify-content-center">
    <div class="mySignIn">
        <form class="form-signin" method="post" action="/login">

            <div class="d-flex justify-content-center">
                <img class="mb-4" src="../images/1492031866172254022.jpg" alt="" width="72" height="72">
            </div>

            <label for="inputUser class="sr-only">Username</label>
            <input type="text" id="inputUser" class="form-control" placeholder="Username" name="username" required autofocus>

            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required>

            <button class="btn btn-lg btn-primary btn-block" id="signIn" type="submit">Sign in</button>
            <p class="mt-5 mb-3 text-muted">&copy; Huawei test application</p>
        </form>
    </div>

</div>
</@gen.g>