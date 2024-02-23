const generarNumeroSecreto = () => {
    const numeroSecreto = Math.floor(Math.random() * 100) + 1;
    return numeroSecreto;
}

const result = document.getElementById('resultado');
const form = document.getElementById('ingresar-numero');
let listaDeNumeros = [];
const numeroSecreto = generarNumeroSecreto();

form.addEventListener('submit', (event) => {
    event.preventDefault();
    const input = document.getElementById('numero');
    const esNumero = !isNaN(parseInt(input.value));
    let numero = 0;

    if (esNumero) {
        numero = parseInt(input.value);
        if (numero >= 1 && numero <= 100) {
            result.innerHTML = `<p> El número ingresado es ${numero}</p>`;
            main(numero, numeroSecreto);
            input.value = "";
        } else {
            result.innerHTML =
                `<p> Error, ${numero} no está entre 1 y 100</p>`;
            input.value = "";
        }
    } else {
        result.innerHTML = `<p>Error, ${input.value} no es un número</p>`;
        input.value = "";
    }
});

const sonNumerosIguales = (numeroSecreto, numeroDelJugador) => {
    return numeroDelJugador === numeroSecreto;
}

const msjAdivinanza = (adivinoNumero) => {
    let mensaje = "";
    if (adivinoNumero) {
        mensaje = ` Felicidades, adivinaste el número secreto.`;
    } else {
        mensaje = ` Ups, el número secreto es incorrecto, vuelve a intentarlo.`;
    }
    return mensaje;
};

const imprimirMensaje = (mensaje, adivinoNumero, listaDeNumeros) => {
    let contenido = "";
    if (adivinoNumero) {
        contenido = `<p>${mensaje}</p><p> Los números ingresados fueron ${listaDeNumeros.join(', ')}</p>`;
    } else {
        contenido = `<p>${mensaje}</p>`;
    }
    document.getElementById(' msj ').innerHTML = contenido;
}

const main = (numero, numeroSecreto) => {
    let adivinoNumero = sonNumerosIguales(numeroSecreto, numero);
    const msj = msjAdivinanza(adivinoNumero);
    listaDeNumeros.push(numero);
    console.log(numeroSecreto);
    imprimirMensaje(msj, adivinoNumero, listaDeNumeros);
}