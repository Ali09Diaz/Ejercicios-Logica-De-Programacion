package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear Scanner 
        Scanner scanner = new Scanner(System.in);

        // Declarar variables para el día de la semana y la hora
        String diaSemana = "";
        int hora = 0;
        int minutos = 0;

        // Solicitar al usuario el día de la semana y verificar si es válido
        while (true) {
            System.out.print("Ingresa un día de la semanam(Lunes - Viernes): ");
            diaSemana = scanner.nextLine().trim();

            if (esDiaValido(diaSemana)) {
                break;
            } else {
                System.out.println("Día de la semana no válido. Inténtalo de nuevo. ");
            }
        }//fin while
        
        // Solicitar al usuario la hora y min y verificar si son válidos
        while (true) {
            System.out.print("Ingresa la hora (0-23): ");
            hora = scanner.nextInt();
            System.out.print("Ingresa los minutos (0-59): ");
            minutos = scanner.nextInt();

            if (esHoraValida(hora) && esMinutosValidos(minutos)) {
                break;
            } else {
                System.out.println("Hora o minutos no válidos. Inténtalo de nuevo. ");
            }
        }//fin while

        // Calcular los min restantes para el fin de semana
        int minutosParaFinDeSemana = calcularMinutosParaFinDeSemana(diaSemana, hora, minutos);

        // Mostrar el resultado por consola
        System.out.println("Faltan " + minutosParaFinDeSemana + " minutos para el fin de semana");

        // Cerrar el scanner
        scanner.close();
    	}
	
	
		// Función para verificar si el día de la semana es válido
    	public static boolean esDiaValido(String dia) {
        return dia.equalsIgnoreCase("Lunes") ||
               dia.equalsIgnoreCase("Martes") ||
               dia.equalsIgnoreCase("Miércoles") ||
               dia.equalsIgnoreCase("Jueves") ||
               dia.equalsIgnoreCase("Viernes");
    	}//fin validacion del dia ingresado

    	
    	// Función para verificar si la hora es válida (0-23)
    	public static boolean esHoraValida(int hora) {
        return hora >= 0 && hora <= 23;
    	}

    	
    	// Función para verificar si los minutos son válidos (0-59)
    	public static boolean esMinutosValidos(int minutos) {
        return minutos >= 0 && minutos <= 59;
	    }
	
    	
	    // Función para calcular los minutos restantes para el fin de semana
	    public static int calcularMinutosParaFinDeSemana(String dia, int hora, int minutos) {
	        // Definir los minutos en un día, en una hora y en un fin de semana
	        int minEnUnDia = 24 * 60;
	        int minEnUnaHora = 60;
	        int minHastaViernes = 0;

	        
	    // Calcular los minutos hasta el fin de semana desde el día y hora ingresados
	        if (dia.equalsIgnoreCase("Lunes")) {
	            minHastaViernes = (4 * minEnUnDia) + (15 * minEnUnaHora) - (hora * minEnUnaHora + minutos);
	        } else if (dia.equalsIgnoreCase("Martes")) {
	            minHastaViernes = (3 * minEnUnDia) + (15 * minEnUnaHora) - (hora * minEnUnaHora + minutos);
	        } else if (dia.equalsIgnoreCase("Miércoles")) {
	            minHastaViernes = (2 * minEnUnDia) + (15 * minEnUnaHora) - (hora * minEnUnaHora + minutos);
	        } else if (dia.equalsIgnoreCase("Jueves")) {
	            minHastaViernes = (1 * minEnUnDia) + (15 * minEnUnaHora) - (hora * minEnUnaHora + minutos);
	        } else if (dia.equalsIgnoreCase("Viernes")) {
	            if (hora < 15) {
	                minHastaViernes = (15 * minEnUnaHora) - (hora * minEnUnaHora + minutos);
	            }
	        }

	        return minHastaViernes;
		
		
	}//fin

}//fin
