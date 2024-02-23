let celcuisInput = document.querySelector("#celcius > input")
let fahrenheitInput = document.querySelector("#Fahrenheit > input")
let kelvinInput = document.querySelector("#Kelvin > input")


function roundnumbers(number){
    return Math.round(number*100)/100
}

celcuisInput.addEventListener('input', function(){
    let ctemperatura = parseFloat(celcuisInput.value)
    let ftemperatura = (ctemperatura * (9/5)) + 32
    let ktemperatura = ctemperatura + 273.15
    
    fahrenheitInput.value = roundnumbers(ftemperatura)
    kelvinInput.value = roundnumbers(ktemperatura)
})

fahrenheitInput.addEventListener('input', function(){
    let ftemperatura = parseFloat(fahrenheitInput.value)
    let ctemperatura= (ftemperatura -32) * (5/9)
    let ktemperatura = (ftemperatura -32) * (5/9) + 273.15

    celcuisInput.value = roundnumbers(ctemperatura)
    kelvinInput.value = roundnumbers(ktemperatura)
})

kelvinInput.addEventListener('input', function(){
    let ktemperatura = parseFloat(kelvinInput.value)
    let ctemperatura= ktemperatura -273.15
    let ftemperatura= (ktemperatura -273.15) * (9/5) +32

    celcuisInput.value = roundnumbers(ctemperatura)
    fahrenheitInput.value = roundnumbers(ftemperatura)
})