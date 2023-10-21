package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	 public static void main(String[] args) {
	
	// Crear un scanner
    Scanner scanner = new Scanner(System.in);

    // Ingrese una palabra 
    System.out.print("Ingresa una palabra o frase: ");
    String texto = scanner.nextLine();

    // Llamar a la función para invertir el texto
    String textoInvertido = invertirTexto(texto);
    
    // Texto invertido por consola
    System.out.println("Texto invertido: " + textoInvertido);

    // Cerrar scanner
    scanner.close();
	}

	// Función para invertir un texto
	public static String invertirTexto(String texto) {
    StringBuilder textoInvertido = new StringBuilder();
    for (int i = texto.length() - 1; i >= 0; i--) {
        textoInvertido.append(texto.charAt(i));
    }
    return textoInvertido.toString();
 
	
	}//fin

}//fin
