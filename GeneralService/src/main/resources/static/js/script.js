$( document ).ready(function() {
    console.log("hei");
    var newBid = $('#newBid');
    var logoutButton = $('#logoutButton');

    newBid.click(function(){
        console.log("clicked");
        $('#myModal').modal('show')
    });

    logoutButton.click(function(){
        window.location = ("../templates/sign-in.html");
    });

    $('#bidsTable').DataTable( {
        "scrollY":        "290px",
        "scrollCollapse": false,
        "paging":         false
    } );

    $('.dataTables_length').addClass('bs-select');
    
    $('#bidsTable_filter').css("visibility", "hidden");
  
    
   
  });
