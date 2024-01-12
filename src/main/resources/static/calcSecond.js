 

function resultado(){
    if (operadoresPadrao.includes(screen.value[screen.value.length - 1])) {
        screen.value = "0";
    } else {
        screen.value = eval(screen.value);
    }
}
