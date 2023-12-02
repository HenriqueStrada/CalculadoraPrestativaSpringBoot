window.onload = function() {
    $(document).ready(function() {
        $("#userVoltar").click(function() {
            //Mostra o formulário 1
            $('#form1').show();
            $("#userVoltar").hide();
            //Esconde o formulário 2
            $('.form2').hide();
            $("#userAlt").show();
            // Esconde o formulário 3
            $(".form3").hide();
            $("#userDelet").show();
        });
    });
    $(document).ready(function() {
        $("#userAlt").click(function() {
            // Esconde o formulário 1
            $('#form1').hide();
            $("#userVoltar").show();
            // Exibe o formulário 2
            $('.form2').show();
            $("#userAlt").hide();
            // Esconde o formulário 3
            $(".form3").hide();
            $("#userDelet").hide();
        });
    });
    $(document).ready(function() {
        $("#userDelet").click(function() {
            //Esconde o formulário 1
            $('#form1').hide();
            $("#userVoltar").show();
            //Esconde o formulário 2
            $('.form2').hide();
            $("#userAlt").hide();
            // Mostrar o formulário 3
            $(".form3").show();
            $("#userDelet").hide();
        });
    });
};
