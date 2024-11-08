package ejercicio4;

import java.util.Scanner;

public class Ejercicio4prueba {

	// Suponiendo dos arrays, comprobad si el contenido de los elementos de uno se
	// corresponde con el contenido de los elementos de otro, indicando cuántos se
	// corresponden.

	static int[] array(int numero) {
		int b=1;

		Scanner sc = new Scanner(System.in);
		int[] a = new int[numero];
		for (int i = 0; i < a.length; i++) {
			System.out.println("introduce el elemento " + i + " del " + b + "º array ");
			a[i] = sc.nextInt();

		}
		b++; //preguntar porque no se puede poner debajo del return, preguntar como arreglarlo
		return a;
		
	}

	public static void main(String[] args) {

		System.out.println("introduce la cantidad de elementos del primer array");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] v = array(n); //pedir el pimer array

		System.out.println("introduce la cantidad de elementos del segundo array");

		int n1 = sc.nextInt(); 

		int[] x = array(n1); //pedir el segundo array

		int i = 0; 
		int igual = 0;
		while (i < v.length && i < x.length) {
			if (v[i] == x[i]) {		//Comprobar cuantos numeros hay iguales
				igual++;

			}
			i++;
		}

		if (igual == n && igual == n1) {	//comprobar si todos los numeros son iguales
			System.out.println("hay " + igual + " numeros iguales ¡Todos tus numeros son iguales!");

		} else {
			System.out.println("hay " + igual + " numeros iguales");
		}
	}

}
