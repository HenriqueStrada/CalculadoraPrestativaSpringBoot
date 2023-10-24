window.onload = function() {
    pegaValores = function () {
        var valorUm = prompt("Digite o primeiro valor: ");
        var valorDois = prompt("Digite o segundo valor: ");
        return [valorUm, valorDois];
    }

    function calcularSoma() {
        // Obter os valores usando promptss
        var valor1 = prompt("Digite o primeiro valor: ");
        var valor2 = prompt("Digite o segundo valor: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/soma?valor1=' + valor1 + '&valor2=' + valor2)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado da soma é: " + resultado);
            });
    }

    function calcularSub() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite o primeiro valor: ");
        var valor2 = prompt("Digite o segundo valor: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/sub?valor1=' + valor1 + '&valor2=' + valor2)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado da subtração é: " + resultado);
            });
    }

    function calcularMulti() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite o primeiro valor: ");
        var valor2 = prompt("Digite o segundo valor: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/multi?valor1=' + valor1 + '&valor2=' + valor2)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado da multiplicação é: " + resultado);
            });
    }

    function calcularDiv() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite o primeiro valor: ");
        var valor2 = prompt("Digite o segundo valor: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/div?valor1=' + valor1 + '&valor2=' + valor2)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado da divisão é: " + resultado);
            });
    }

    function calcularRaiz() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite o valor que deseja descobrir a raiz: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/raiz?valor1=' + valor1)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado da raiz é: " + resultado);
            });
    }

    function calcularCircu() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite o valor do seu raio (caso tiver apenas diametro, divida por 2 e coloque aqui novamente):");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/circu?valor1=' + valor1)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("A circunferencia é: " + resultado);
            });
    }

    function calcularHipo() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite o primeiro cateto: ");
        var valor2 = prompt("Digite o segundo segundo: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/hipo?valor1=' + valor1 + '&valor2=' + valor2)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("A hipotenusa é: " + resultado);
            });
    }

    function metPes() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite quantos metros deseja converter:");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/metPes?valor1=' + valor1)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado convertido para pés: " + resultado);
            });
    }

    function pesMet() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite quantos pés deseja converter:");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/pesMet?valor1=' + valor1)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado convertido para metros: " + resultado);
            });
    }

    function quiMil() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite quantas quilômetros deseja converter:");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/pesMet?valor1=' + valor1)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado convertido para milhas: " + resultado);
            });
    }

    function milQui() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite quantas milhas deseja converter:");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/pesMet?valor1=' + valor1)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado convertido para quilômetros: " + resultado);
            });
    }

    function polCen() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite quantas polegadas deseja converter:");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/polCen?valor1=' + valor1)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado convertido para centímetros: " + resultado);
            });
    }

    function cenPol() {
        // Obter os valores usando prompts
        var valor1 = prompt("Digite quantos centímetros deseja converter:");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/cenPol?valor1=' + valor1)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado convertido para polegadas: " + resultado);
            });
    }

    function seno() {
        // Obter os valores usando promptss
        var valor1 = prompt("Digite o cateto oposto: ");
        var valor2 = prompt("Digite a hipotenusa: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/seno?valor1=' + valor1 + '&valor2=' + valor2)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado do seno é: " + resultado);
            });
    }

    function cos() {
        // Obter os valores usando promptss
        var valor1 = prompt("Digite o cateto adjacente: ");
        var valor2 = prompt("Digite a hipotenusa: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/cos?valor1=' + valor1 + '&valor2=' + valor2)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado do cosseno é: " + resultado);
            });
    }

    function tan() {
        // Obter os valores usando promptss
        var valor1 = prompt("Digite o cateto oposto: ");
        var valor2 = prompt("Digite o cateto adjacente: ");

        // Enviar uma solicitação HTTP para o servidor com os valores
        fetch('/tan?valor1=' + valor1 + '&valor2=' + valor2)
            .then(response => response.text())
            .then(resultado => {
                // Receber a resposta do servidor e exibir um alerta com o resultado
                window.alert("O resultado da tangente é: " + resultado);
            });
    }

    document.getElementById("medida").onclick = function () {
        var botoesMenores = document.getElementById("menores");
        if (botoesMenores.style.display === "none") {
            botoesMenores.style.display = "block";
        } else {
            botoesMenores.style.display = "none";
        }
    }
    document.getElementById("ang").onclick = function () {
        var botoesMenores = document.getElementById("menor");
        if (botoesMenores.style.display === "none") {
            botoesMenores.style.display = "block";
        } else {
            botoesMenores.style.display = "none";
        }
    }
    // function enviar (){
    //         var nomeUser = document.getElementById('nomeUser').value;
    //         var senhaUser = document.getElementById('senhaUser').value;
    //
    //     // Enviar uma solicitação HTTP para o servidor com os valores
    //     fetch('/log?nomeUser=' + nomeUser + '&senhaUser=' + senhaUser)
    //         .then(response => response.text())
    //         .then(resultado => {
    //             // Receber a resposta do servidor e exibir um alerta com o resultado
    //             window.alert("Resultado do login: " + resultado);
    //         });
    // }

    document.getElementById("soma").onclick = function () {
        calcularSoma();
    }
    document.getElementById("sub").onclick = function () {
        calcularSub();
    }
    document.getElementById("multi").onclick = function () {
        calcularMulti();
    }
    document.getElementById("div").onclick = function () {
        calcularDiv();
    }
    document.getElementById("raiz").onclick = function () {
        calcularRaiz();
    }
    document.getElementById("circu").onclick = function () {
        calcularCircu();
    }
    document.getElementById("hipo").onclick = function () {
        calcularHipo();
    }
    document.getElementById("metPes").onclick = function () {
        metPes();
    }
    document.getElementById("pesMet").onclick = function () {
        pesMet();
    }
    document.getElementById("quiMil").onclick = function () {
        quiMil();
    }
    document.getElementById("milQui").onclick = function () {
        milQui();
    }
    document.getElementById("polCen").onclick = function () {
        polCen();
    }
    document.getElementById("cenPol").onclick = function () {
        cenPol();
    }
    document.getElementById("seno").onclick = function () {
        seno();
    }
    document.getElementById("cos").onclick = function () {
        cos();
    }
    document.getElementById("tan").onclick = function () {
        tan();
    }
    // document.getElementById("enviar").onclick = function () {
    //     enviar();
    // }
}