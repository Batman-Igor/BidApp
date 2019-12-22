$( document ).ready(function() {
    var button = $('#signIn');


    //  window.location = url;

    button.click(function(){
        var login = $('#inputEmail');
        var password = $('#inputPassword');
        if(login.val() == "qwe@qwe.ru" && password.val() == "123"){
          
            window.location = ("../templates/index.html");
            
        }
 
    });
    
   
  });