

function calculateFactorial() {
    const numeroInput = document.getElementById('numeroInput').value;
    const resultadoElement = document.getElementById('resultado');
    
    if (isNaN(numeroInput) || numeroInput === '') {
        resultadoElement.textContent = 'Error: favor de ingresar un numero valido.';
        return;
    }

    const number = parseInt(numeroInput);

    // Calcular el factorial
    const factorial = calculateFactorialRecursive(number);
    
    // Mostrar el resultado
    resultadoElement.textContent = `Factorial de ${number} es: ${factorial}`;
}

function calculateFactorialRecursive(n) {
    if (n === 0 || n === 1) {
        return 1;
    } else {
        return n * calculateFactorialRecursive(n - 1);
    }
}