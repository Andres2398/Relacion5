package ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Dado un array de números enteros asignar los elementos de contenido impar al
		// array
		// impar y los elementos de contenido par al array par indicando cuántos
		// elementos se han
		// pasado a cada uno de ellos.

		System.out.println("introduce el tamaño de los arrays");
		Scanner sc = new Scanner(System.in);
		int tamaño = sc.nextInt();

		int[] par = new int[tamaño];
		int[] impar = new int[tamaño];
		int numero = 0;
		Random r = new Random();
		int a = 0;
		int b = 0;
		numero = 0;
		int contadorpar = 0;
		int contadorimpar = 0;
		boolean seguir = true;
		while (seguir) {
			while (a < par.length && b < impar.length) {
				numero = r.nextInt(100);
				if (numero % 2 == 0) {

					par[a] = numero;
					contadorpar++;
					a++;

				} else {
					impar[b] = numero;
					contadorimpar++;
					b++;

				}

			}
			if (numero % 2 == 0 && a==par.length )
				seguir = false;
			else if (numero % 2 != 0 && b==impar.length)
				seguir = false;

		}

		for (int i = 0; i < impar.length; i++) {
			System.out.println("conjunto impar " + impar[i]);
		}
		System.out.println(" hay " + contadorimpar + " numeros impares");
		for (int i = 0; i < par.length; i++) {
			System.out.println("conjunto par " + par[i]);
		}
		System.out.println(" hay " + contadorpar + " numeros pares");

	}

}
