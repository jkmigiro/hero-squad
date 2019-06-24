$( document ).ready(function() {
    console.log( "ready!" );
$("#frm").submit(function() {

    var name = $("#name").val();
    var comment = $("#email").val();

    if(name == "" || comment == "" ) {
        $("#error_message").show().html("All Fields are Required");
    } else {
        $("#error_message").html("").hide();
        $('#success_message').fadeIn().html(data);

                setTimeout(function() {
                    $('#success_message').fadeOut("slow");
                }, 2000 );



    }
});
});
