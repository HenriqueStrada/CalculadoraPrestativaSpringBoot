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
            window.alert("O resultado da soma é: " + resultado);
        });
}


document.getElementById("soma").onclick = function() {
    calcularSoma();
}

document.getElementById("sub").onclick = function() {
   calcularSub();
}
document.getElementById("multi").onclick = function() {
    var valores = pegaValores();
    var resultado = parseFloat(valores[0]) * parseFloat(valores[1]);
    window.alert("O resultado da multiplicação é: " + resultado);
    console.log("O resultado da multiplicação é: " + resultado);
}
document.getElementById("div").onclick = function() {
    var valores = pegaValores();
    var resultado = parseFloat(valores[0]) / parseFloat(valores[1]);
    window.alert("O resultado da divisão é: " + resultado);
    console.log("O resultado da divisão é: " + resultado);
}