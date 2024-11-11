package ejercicio10;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Dado un array de números enteros asignar los elementos de contenido impar al
		// array
		// impar y los elementos de contenido par al array par indicando cuántos
		// elementos se han
		// pasado a cada uno de ellos.

		int[] primerarray = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int numero = 0;
		Random r = new Random();
		int a = 0;
		int b = 0;
		int contadorpar = 0;
		int contadorimpar = 0;
		boolean seguir = true;

		// rellenar primer array de numeros aleatorios

		for (int i = 0; i < primerarray.length; i++) {
			numero = r.nextInt(100);
			primerarray[i] = numero;

		}

		int j = 0;
		int c = 0;

		for (int i = 0; i < primerarray.length; i++) {
			numero = primerarray[i];
			if (numero%2==0) {
				par[i]=numero;
				j++;
			}else {
				impar[i]=numero;
				c++;
			}
		}
			
			
		for (int i = 0; i < impar.length; i++) {
			System.out.println("conjunto impar " + impar[i]);
		}
		System.out.println(" hay " + c + " numeros impares");
		for (int i = 0; i < par.length; i++) {
			System.out.println("conjunto par " + par[i]);
		}
		System.out.println(" hay " + j + " numeros pares");

	}

}
