

// Genera un numero aleatorio entre 1 y 100
function generarNumeroSecreto() {
    return Math.floor(Math.random() * 100) + 1;
  }

  // Función para validar si un número es válido (entero del 1 al 100)
  function esNumeroValido(numero) {
    return !isNaN(numero) && numero >= 1 && numero <= 100;
  }

 // Inicializamos el número secreto
 const numeroSecreto = generarNumeroSecreto();
    
 // Inicializamos una lista de números ingresados
 const numerosIngresados = [];

 // Llamar la funcion del juego
 adivinarNumero();

 // Función para escubrir el número secreto
 function adivinarNumero() {
   let intentos = 0;
   while (true) {
     const input = prompt("Adivina el número secreto (1 al 100):");
     const numero = parseInt(input);

     if (esNumeroValido(numero)) {
       intentos++;
       numerosIngresados.push(numero);

       if (numero === numeroSecreto) {
         console.log("Felicidades, adivinaste el número secreto.");
         console.log("Númros introducidos antes de adivinar el número secreto: " + numerosIngresados.join(", "));
         break;
       } else {
         console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
       }
     } else {
       console.log("Error: Ingresa un número válido del 1 al 100.");
     }
   }
 }

  