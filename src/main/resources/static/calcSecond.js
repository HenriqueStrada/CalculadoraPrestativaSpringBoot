var screen = document.querySelector("#screen");

document.querySelector("#limpar").addEventListener("click", function (){
    screen.value = "";
});

document.querySelector("#deletar").addEventListener("click", function (){
    screen.value = screen.value.substring(0,(screen.value.length -1));
});
const operadoresPadrao = ["*", "+", "-", "/", "."];

function addToScreen(value){

    screen.value += value;

    if(operadoresPadrao.includes(value)){
        var valorAnterior = screen.value.length -2;
        if(operadoresPadrao.includes(screen.value[valorAnterior])){
            screen.value = screen.value.substring(0, (screen.value.length -2));
            screen.value = screen.value + value;
        }
        switch (screen.value[0]){
            case "*":
                screen.value = "";
            case "+":
                screen.value = "";
            case "/":
                screen.value = "";
            case "-":
                screen.value = "";
            case ".":
                screen.value = "";
        }
    }
}

function resultado(){
    if (operadoresPadrao.includes(screen.value[screen.value.length - 1])) {
        screen.value = "0";
    } else {
        screen.value = eval(screen.value);
    }
}
