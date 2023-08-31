pegaValores = function(){
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
    fetch('/Hipo?valor1=' + valor1 + '&valor2=' + valor2)
        .then(response => response.text())
        .then(resultado => {
            // Receber a resposta do servidor e exibir um alerta com o resultado
            window.alert("A hipotenusa é: " + resultado);
        });
}


document.getElementById("soma").onclick = function() {
    calcularSoma();
}
document.getElementById("sub").onclick = function() {
   calcularSub();
}
document.getElementById("multi").onclick = function() {
    calcularMulti();
}
document.getElementById("div").onclick = function() {
    calcularDiv();
}
document.getElementById("raiz").onclick = function() {
    calcularRaiz();
}
document.getElementById("circu").onclick = function() {
    calcularCircu();
}
document.getElementById("hipo").onclick = function() {
    calcularHipo();
}
