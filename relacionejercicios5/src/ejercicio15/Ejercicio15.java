package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	static int posicionMenor(int[] mayores) {

		int menor = mayores[0];
		for (int i = 0; i < mayores.length; i++) {
			if (menor > mayores[i])
				menor = i;

		}

		return menor;
	}

	public static void main(String[] args) {
		// Realizar un programa que reciba desde teclado un número indeterminado de
		// valores
		// enteros positivos (puede terminar la introducción de datos con el valor 0) y
		// presente en
		// orden descendente por pantalla los 10 mayores valores introducidos. Puede que
		// se
		// introduzcan menos de 10 valores.

		int[] mayores = new int[10];
		int recogida = 0;
		System.out.println("introduce un numero, 0 para terminar el programa");
		Scanner sc = new Scanner(System.in);
		recogida = sc.nextInt();

		while (recogida != 0) {

			int posicion = posicionMenor(mayores);
			if (recogida > mayores[posicion]) {
				mayores[posicion] = recogida;

			}
			System.out.println("introduce un numero, 0 para terminar el programa");
			recogida = sc.nextInt();

		}

		for (int j = 0; j < mayores.length; j++) {
			System.out.println("{" + mayores[j] + "} ");

		}

	}

}
