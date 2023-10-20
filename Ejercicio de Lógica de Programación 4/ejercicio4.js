function calculadora() {
    let numeroIngresado = document.getElementById("numeroIngresado").value;
    let resultado = document.getElementById("resultado");

    // Verificar si el valor ingresado es un número válido
    if (!isNaN(numeroIngresado)) {
        let numero = parseInt(numeroIngresado);
        if (numero < 0) {
            resultado.innerHTML = "Ingrese un número NO negativo.";
        } else {
            let serieFibonacci = [];
            let a = 0;
            let b = 1;

            for (let i = 0; i < numero; i++) {
                serieFibonacci.push(a);
                let temp = a;
                a = b;
                b = temp + b;
            }

            resultado.innerHTML = "Serie de Fibonacci: " + serieFibonacci.join(", ");
        }
    } else {
        resultado.innerHTML = "Por favor, ingrese un número válido.";
    }
}