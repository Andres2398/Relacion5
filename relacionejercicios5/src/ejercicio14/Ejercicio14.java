package ejercicio14;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {

	static boolean comprobar(int numero, int[] comprobar) {

		boolean esbueno = true;
		int i = 0;
		while (i < comprobar.length && esbueno) {
			if (numero == comprobar[i]) {
				esbueno = false;
			}
			i++;
		}

		return esbueno;
	}

	public static void main(String[] args) {
		// Realizar un programa que nos permita jugar al BINGO por ordenador. Su
		// funcionamiento debe ser el siguiente:
		// - El programa irá sacando aleatoriamente "bolitas" por pantalla (números del
		// 1 al 90). - Cuando se hayan sacado las 15 primeras bolas el programa
		// preguntará
		// “¿(S)iguiente bola, (C)omprobar Bingo o (T)erminar?”
		// En el primer caso aparecerá en pantalla un nuevo número. En el segundo caso
		// se
		// aceptarán desde teclado los 15 números del cartón supuestamente premiado y el
		// ordenador dirá si se ha acertado o no el Bingo. En el tercer caso finalizará
		// el programa.
		// Si el bingo es correcto también terminará el programa.

		boolean esbueno = false;
		int[] bingo = new int[90];
		int[] arrayComprobar = new int[50];
		int numero = 0;
		Random r = new Random();

		for (int i = 0; i < bingo.length; i++) {
			bingo[i] = i + 1;
		}
		int i = 0;
		System.out.println("Los primeros 15 numeros son:");
		while (i < 15) {
			numero = r.nextInt(90);

			if (comprobar(numero, arrayComprobar)) {
				arrayComprobar[i] = numero;
				System.out.print("{" + arrayComprobar[i] + "} ");
				i++;
			}
			
		}

		System.out.println(
				"\n \n Introduce un 0 para sacar la siguiente bola, un 1 para comprobar el bingo y un 2 para terminar el programa");
		Scanner sc = new Scanner(System.in);
		int recogida = 0;
		int total = 0;
		boolean seguir = true;
		
		int carton = 0;
		recogida = sc.nextInt();
		while (seguir) {
			
			//sacar nuevo numero
			if (recogida == 0) {
				numero = r.nextInt(90);
				if (comprobar(numero, arrayComprobar)) {
					arrayComprobar[i] = numero;
					System.out.print("{" + arrayComprobar[i] + "} ");
					i++;
					
				}
				
				// comprobar bingo
			} else if (recogida == 1) {
				
				//comprobar cada numero al total sacados
				while (total < 15) {
					System.out.println("introduce el siguiente digito");
					carton = sc.nextInt();
					for (int j = 0; j < arrayComprobar.length; j++) {
						if (carton == arrayComprobar[j]) {
							total++;
						}
					}
				}
				seguir = false;
			} else if (recogida == 2)
			seguir = false;
			
			//pedir nuevo numero en caso de que haya metido el 0 previamente
			System.out.println(
					"\n \n Introduce un 0 para sacar la siguiente bola, un 1 para comprobar el bingo y un 2 para terminar el programa");
			recogida=sc.nextInt();
		}
		
		if (total == 15) {
			System.out.println("Bingo");
		} else {
			System.out.println("No has acertado");
		}
	}

}
