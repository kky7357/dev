$(document).ready(function() {

    $('#nav-notice-tab').click(function () {
        console.log("callback function")
        $.ajax({  
            type:"POST",
            url: ("/getList"),
            data: {"groupId":"A01"},  
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            success:  function(data){
                console.log("success",data)
            },  
            error: function (jqXHR, textStatus, errorThrown) {
                console.log("jqXHR: " + jqXHR.status + "\ntextStatus: " + textStatus + "\nerrorThrown: " + errorThrown);
            }
        });  
    });
 });

 