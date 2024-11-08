package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Suponiendo dos arrays, comprobad si el contenido de los elementos de uno se
		// corresponde con el contenido de los elementos de otro, indicando cuántos se
		// corresponden.

		System.out.println("introduce la cantidad de elementos del primer array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] v = new int[n];
		for (int i = 0; i < v.length; i++) {
			System.out.println("introduce el elemento del primer array " + i);
			v[i] = sc.nextInt();

		}

		System.out.println("introduce la cantidad de elementos del segundo array");
		int n1 = sc.nextInt();

		int[] x = new int[n1];
		for (int i = 0; i < x.length; i++) {
			System.out.println("introduce el elemento del primer array " + i);
			x[i] = sc.nextInt();
		}

		int i = 0;
		int igual = 0;
		while (i < v.length && i < x.length) {
			if (v[i] == x[i]) {
				igual++;

			}
			i++;
		}

		if (igual == n && igual == n1) {
			System.out.println("todos tus numeros son iguales");

		} else {
			System.out.println("hay " + igual + " numeros iguales");

		}

	}
}
