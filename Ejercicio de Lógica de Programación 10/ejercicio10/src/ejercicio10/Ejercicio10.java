package ejercicio10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
	 public static void main(String[] args) {
		// crear Scanner 
	        Scanner scanner = new Scanner(System.in);

	        // 20 palabras del diccionario
	        Map<String, String> diccionario = new HashMap<>();
	        diccionario.put("mapa", "map");
	        diccionario.put("doctor", "doctor");
	        diccionario.put("dentista", "dentist");
	        diccionario.put("perro", "dog");
	        diccionario.put("gato", "cat");
	        diccionario.put("vaso", "glass");
	        diccionario.put("casa", "house");
	        diccionario.put("zapatos", "shoes");
	        diccionario.put("vestido", "dress");
	        diccionario.put("azul", "blue");
	        diccionario.put("mesa", "table");
	        diccionario.put("agua", "water");
	        diccionario.put("rojo", "red");
	        diccionario.put("verde", "green");
	        diccionario.put("musica", "music");
	        diccionario.put("rojo", "red");
	        diccionario.put("naranja", "orange");
	        diccionario.put("telefono", "phone");
	        diccionario.put("rosa", "pink");
	        diccionario.put("gris", "grey");
	        
	        // Seleccionar 5 palabras al azar 
	        String[] palabrasElegidas = seleccionarPalabrasAlAzar(diccionario, 5);

	        // Inicio
	        int correctas = 0;
	        int incorrectas = 0;

	        for (String palabraEspañol : palabrasElegidas) {
	            String traduccionCorrecta = diccionario.get(palabraEspañol);

	            System.out.print("Traduce '" + palabraEspañol + "' al inglés: ");
	            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();

	            if (respuestaUsuario.equals(traduccionCorrecta)) {
	                System.out.println("¡Respuesta correcta!");
	                correctas++;
	            } else {
	                System.out.println("Respuesta incorrecta. La respuesta correcta es '" + traduccionCorrecta + "'.");
	                incorrectas++;
	            }
	        }

	        // Mostrar el resultado final
	        System.out.println("Juego terminado.");
	        System.out.println("Respuestas correctas: " + correctas);
	        System.out.println("Respuestas incorrectas: " + incorrectas);

	        // Cerrar scanner
	        scanner.close();
	    }
	 
	// Seleccionar palabras al azar 
	    public static String[] seleccionarPalabrasAlAzar(Map<String, String> diccionario, int cantidad) {
	        String[] palabras = new String[cantidad];
	        Random random = new Random();
	        Object[] palabrasArray = diccionario.keySet().toArray();

	        for (int i = 0; i < cantidad; i++) {
	            palabras[i] = (String) palabrasArray[random.nextInt(palabrasArray.length)];
	        }

	        return palabras;
		 
		 
		 
		 
		 
		 
		 
	 }//fin

}//fin
