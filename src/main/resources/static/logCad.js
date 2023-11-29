window.onload = function() {
    $(document).ready(function() {
        $("#userAlt").click(function() {
            // Esconde o formulário 1
            $('#form1').hide();
            $("#userVoltar").show();
            // Exibe o formulário 2
            $('.form2').show();
            $("#userAlt").hide();
        });
    });
    $(document).ready(function() {
        $("#userVoltar").click(function() {
            // Esconde o formulário 1
            $('#form1').show();
            $("#userVoltar").hide();
            // Exibe o formulário 2
            $('.form2').hide();
            $("#userAlt").show();
        });
    });
};
