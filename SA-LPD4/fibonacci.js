function fibonacci(n) {
    var fibSeries = [0, 1];
    for (var i = 2; i < n; i++) {
        fibSeries.push(fibSeries[i - 1] + fibSeries[i - 2]);
    }
    return fibSeries;
}

function generateFibonacciSeries() {
    var numInput = document.getElementById("numberInput");
    var num = parseInt(numInput.value);
    
    // Verificar si el input es un número
    if (isNaN(num)) {
        alert("Por favor, ingrese un número válido.");
        return;
    }

    var series = fibonacci(num);
    console.log("Serie de Fibonacci para", num, "números:", series);
}