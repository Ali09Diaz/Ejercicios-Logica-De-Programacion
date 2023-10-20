function calculadora() {
    let numeroIngresado = document.getElementById("numeroIngresado").value;
    let resultadoCalculado = document.getElementById("resultado");

    // Verificación de número válido
    if (!isNaN(numeroIngresado)) {
        let numero = parseInt(numeroIngresado);
        if (numero < 0) {
            resultadoCalculado.innerHTML = "El factorial de un número negativo no está definido.";
        } else {
            let factorial = 1;
            for (let i = 1; i <= numero; i++) {
                factorial *= i;
            }
            resultadoCalculado.innerHTML = "El factorial de " + numero + " es: " + factorial;
        }
    } else {
        resultadoCalculado.innerHTML = "Por favor, ingrese un número válido.";
    }
}