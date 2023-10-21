package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		// Crear un objeto Scanner para la entrada del usuario
		   Scanner scanner = new Scanner(System.in);

		// Declarar un array para almacenar los numeros
		   int[] numeros = new int[10];

		// Ingresa 10 numeros y almacenarlos en el array
		   for (int i = 0; i < 10; i++) {
		   System.out.print("Ingresa un número: ");
		   numeros[i] = scanner.nextInt();
		   }//fin for

		// Ordenar los numeros primos al principio del array
		   ordenarNumerosPrimosAlInicio(numeros);

		// Mostrar el array con los numeros primos al inicio
		   for (int i = 0; i < numeros.length; i++) {
		   System.out.println("pos[" + i + "] = " + numeros[i]);
		   }//fin for

		// Cerrar el scanner
		   scanner.close();
		    }

		// verificacion del numero (primo)
		   public static boolean esPrimo(int numero) {
			   if (numero <= 1) {
		            return false;
		        }
		       for (int i = 2; i * i <= numero; i++) {
		            if (numero % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

		// Ordenar los numers primos al inicio del array
		   public static void ordenarNumerosPrimosAlInicio(int[] numeros) {
			   int[] temp = new int[numeros.length];
		       int primosIndex = 0;
		       int noPrimosIndex = numeros.length - 1;

		       for (int numero : numeros) {
		    	   if (esPrimo(numero)) {
		                temp[primosIndex] = numero;
		                primosIndex++;
		            } else {
		                temp[noPrimosIndex] = numero;
		                noPrimosIndex--;
		            }
		        }//fin for

		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = temp[i];
		        }//fin for
		
	}//fin

}//fin
