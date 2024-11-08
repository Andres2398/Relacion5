package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Dado un array representar el número de veces que se repite cada elemento

		System.out.println("Introduce el tamaño del array");

		Scanner sc = new Scanner(System.in);
		int tamaño = sc.nextInt();

		int[] v = new int[tamaño];			//pedimos tamaño del array

		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce la posicion " + i + " del array");
			v[i] = sc.nextInt(); 		//metemos los numeros del array en el array V
			
		}
		int iguales=0;
		int suma;
		for (int i = 0; i < v.length; i++) {
			suma = 0;														
			iguales = v[i];							// Cada elemento del array se comprueba con todos los demas 
			for (int j = 0; j < v.length; j++) {
				if (iguales == v[j]) {
					suma++;
				}
			}
			if (suma > 1) {
				System.out.println("el numero " + v[i] + " se repite " + suma + " veces");
			} else {
				System.out.println("el numero " + v[i] + " no se repite");
			}
		}
	}

}
