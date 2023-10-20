// Solicitar la temperatura en grados Celsius
let celsius = parseFloat(prompt("Por favor ingrese la temperatura en grados Celsius:"));

//console.log("Usted ingresó "+ celsius + " ºC");

// Verificar si el valor ingresado es un número válido
if (!isNaN(celsius)) {
    // Conversiones
    let fahrenheit = (celsius * 9 / 5) + 32;
    let kelvin = celsius + 273.15;

    
    //console.log("Usted ingresó "+ celsius + " ºC");
    // Conversiones por consola
    console.log("Grados Fahrenheit : " + fahrenheit);
    console.log("Grados Kelvin : " + kelvin);
} else {
    console.log("Usted ingresó "+ celsius + " por lo que no es valido");
    console.log("Por favor refresque la pagina e ingrese una temperatura válida en grados Celsius.");
}