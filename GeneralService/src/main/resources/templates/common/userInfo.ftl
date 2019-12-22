<#macro userInfo>
<div class="container-fluid">
    <div class="row">
        <!-- left -->
        <div class="col-md-5 ">
            <div class="card mb-3 myCard card text-white bg-dark" style="max-width: 540px;">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="../images/uYjInVHH_400x400.jpg" class="card-img myImage" alt="...">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <!-- <h5 class="card-title">About</h5> -->
                            <div class="list-group ">
                                <div class="list-group-item list-group-item text-dark">
                                    <div class="d-flex w-100 justify-content-between">
                                        <h5 class="mb-1">Name</h5>
                                    </div>
                                    <p class="mb-1">${name}</p>
                                </div>

                                <div class="list-group-item list-group-item text-dark">
                                    <div class="d-flex w-100 justify-content-between">
                                        <h5 class="mb-1">DoB</h5>
                                    </div>
                                    <p class="mb-1">12.04.1965</p>
                                </div>
                                <div class="list-group-item list-group-item text-dark">
                                    <div class="d-flex w-100 justify-content-between">
                                        <h5 class="mb-1">Position</h5>
                                    </div>
                                    <p class="mb-1">${role}</p>
                                </div>
                                <div class="list-group-item list-group-item text-dark">
                                    <div class="d-flex w-100 justify-content-between">
                                        <h5 class="mb-1">Email</h5>
                                    </div>
                                    <p class="mb-1">${email}</p>
                                </div>
                            </div>
                            <!--   data-toggle="modal" data-target="#myModal" -->
                            <button type="button" id="newBid"
                                    class="btn btn-primary btn-lg btn-block myBlockButton">Create a
                                new bid
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</#macro>