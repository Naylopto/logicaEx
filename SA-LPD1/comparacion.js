const button = document.querySelector("button")

button.onclick = function (){
    let numero1 = parseFloat(prompt("Ingrese el primer número:"));
    let numero2 = parseFloat(prompt("Ingrese el segundo número:"));
    let numero3 = parseFloat(prompt("Ingrese el tercer número:"));

    if( numero1 === numero2 && numero1 === numero3){
        console.log("los numeros son iguales: " + numero1 + "," + numero2 + "," +  numero3);
    } else {
        let mayor, centro, menor;
        if(numero1 >= numero2 && numero1 >= numero3){
            mayor = numero1;
            centro = (numero2 >= numero3) ? numero2 : numero3;
            menor = (numero2 <= numero3) ? numero2 : numero3;
        } else if(numero2 >= numero1 && numero2 >= numero3){
            mayor = numero2;
            centro = (numero1 >= numero3) ? numero1 : numero3;
            menor = (numero1<= numero3) ? numero1: numero3;
        } else{
            mayor = numero3;
            centro = (numero1 >= numero2) ? numero1 : numero2;
            menor = (numero1 <= numero2) ? numero1 : numero2;
        }
        console.log("ordenados de mayor a menor: " + mayor +"," + centro + "," + menor);
        console.log("ordenados de mayor a menor: " + menor +"," + centro + "," + mayor);
    }
    
}

    
    

