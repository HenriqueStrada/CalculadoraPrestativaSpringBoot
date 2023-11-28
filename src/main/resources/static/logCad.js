window.onload = function() {
    $(document).ready(function() {
        $("#userAlt").click(function() {
            // Esconde o formulário 1
            $('#form1').hide();
            // Exibe o formulário 2
            $('.form2').show();
        });
    });
};
