package ejercicio4;

import java.util.Scanner;

public class Ejercicio4prueba {

	// Suponiendo dos arrays, comprobad si el contenido de los elementos de uno se
	// corresponde con el contenido de los elementos de otro, indicando cuántos se
	// corresponden.

	static int[] array(int tamano) {
		

		Scanner sc = new Scanner(System.in);
		int[] rellenararray = new int[tamano];
		for (int i = 0; i < rellenararray.length; i++) {
			System.out.println("introduce el elemento " + i + " del array ");
			rellenararray[i] = sc.nextInt();

		}
		
		return rellenararray;
		
	}

	public static void main(String[] args) {

		System.out.println("introduce la cantidad de elementos del primer array");
		Scanner sc = new Scanner(System.in);

		int tamano = sc.nextInt();

		int[] v = array(tamano); //pedir el pimer array

		System.out.println("introduce la cantidad de elementos del segundo array");

		int tamano2 = sc.nextInt(); 

		int[] x = array(tamano2); //pedir el segundo array

		int i = 0; 
		int igual = 0;
		while (i < v.length && i < x.length) {
			if (v[i] == x[i]) {		//Comprobar cuantos numeros hay iguales
				igual++;

			}
			i++;
		}

		if (igual == tamano && igual == tamano2) {	//comprobar si todos los numeros son iguales
			System.out.println("hay " + igual + " numeros iguales ¡Todos tus numeros son iguales!");

		} else {
			System.out.println("hay " + igual + " numeros iguales");
		}
		
		
		
		
		
	}

}
