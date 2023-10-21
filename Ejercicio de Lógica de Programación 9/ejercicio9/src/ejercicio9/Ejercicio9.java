package ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un Scanner 
        Scanner scanner = new Scanner(System.in);

        // Crear diccionario con HashMap
        HashMap<String, String> diccionario = new HashMap<>();
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

        // Solicitar palabra en espanol
        System.out.print("Ingresa una palabra en espanol: ");
        String palabraEspanol = scanner.nextLine().toLowerCase();

        // Buscar la traducción 
        if (diccionario.containsKey(palabraEspanol)) {
            String palabraIngles = diccionario.get(palabraEspanol);
            System.out.println("La traducción al ingles es: " + palabraIngles);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }

        // Cerrar el scanner

	}//fin

}//fin
