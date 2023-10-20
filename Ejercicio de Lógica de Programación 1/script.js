
// Ingresar los valores
let num1 = parseFloat(prompt("Ingresa un numero"));
let num2 = parseFloat(prompt("Ingresa un numero"));
let num3 = parseFloat(prompt("Ingresa un numero"));
//console.log ( "Numeros ingresados " + num1, + num2, + num3);

// Verificar si los valores ingresados son números válidos
if (!isNaN(num1) && !isNaN(num2) && !isNaN(num3)) {
    // Numeros ordenados de mayor a menor
    var mayorMenor = [num1, num2, num3].sort(function (a, b) {
        return b - a;
    });

    // Numeros ordenados de menor a mayor 
    var menorMayor = [num1, num2, num3].sort(function (a, b) {
        return a - b;
    });

    // Mostrar los números en consola
    console.log( mayorMenor.join(", ")); //mayor a menor
    console.log( menorMayor.join(", ")); //menor a mayor

    // Comprobar si los números son iguales
    if (num1 === num2 && num2 === num3) {
        console.log("Los números son iguales.");
    }
} else { //si no son numeros
   console.log("Por favor refresque la pagina e ingrese números válidos.");
}


