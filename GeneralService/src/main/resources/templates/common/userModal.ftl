<#macro modal>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog " role="document">
        <div class="modal-content bg-secondary">
            <div class="modal-header bg-dark myModalHeader">
                <h5 class="modal-title text-white" id="exampleModalLabel">New bid</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body text-white myModalBody">
                    <div class="form-group">
                            <p class="modal-title">Create Bid</p>
                            <form method="post" action="/send">
                                <input type="text" name="title" placeholder="Title" class="modal-input">
                                <input type="text" name="data" placeholder="Data" class="modal-input">
                                <input type="submit" class="btn btn-success modal-send" value="Send">
                            </form>
                    </div>
            </div>
            <div class="modal-footer bg-dark myModalFooter">
                <button type="button" class="btn btn-danger modal-close" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
</#macro>