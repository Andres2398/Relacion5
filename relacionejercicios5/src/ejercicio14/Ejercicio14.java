package ejercicio14;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {

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

		int[] bingo = new int[100];

		int numero = 1;
		Random r = new Random();
		for (int i = 0; i < bingo.length; i++) {
			bingo[i] = numero;
			numero++;
		}
		int aleatorio = 0;

		int[] comprobar = new int[90];

		// primeras 15 bolas
		for (int i = 0; i < 15; i++) {
			aleatorio = r.nextInt(100);

			if (bingo[aleatorio] > 0) {
				System.out.println(bingo[aleatorio]);
				comprobar[i] = bingo[aleatorio];
				bingo[aleatorio] = 0;

			} else {
				aleatorio = r.nextInt(100);
				System.out.println(bingo[aleatorio]);
				comprobar[i] = bingo[aleatorio];

			}
		}

		System.out.println("introduce 0 para sacar otra bolita, 1 para comprobar el bingo y 2 para terminar");

		Scanner sc = new Scanner(System.in);
		int recogida = sc.nextInt();
		boolean seguir = true;
		int i = 15;
		int carton = 0;
		boolean bueno = false;
		int j = 0;

		int total = 0;

		while (seguir)
			// sacar nuevo numero
			if (recogida == 0) {
				aleatorio = r.nextInt(100);
				if (bingo[aleatorio] > 0) {	
					comprobar[i] = bingo[aleatorio];
					System.out.println(bingo[aleatorio]);
					bingo[aleatorio] = 0;

				} else {
					aleatorio = r.nextInt(100);
					System.out.println(bingo[aleatorio]);
					comprobar[i] = bingo[aleatorio];
				}
				i++;

				// comprobar resultado
			} else if (recogida == 1) {
				j = 0;
				while (j < comprobar.length) {

					System.out.println("Introduce un numero de tu carton");
					carton = sc.nextInt();
					for (int j2 = 0; j2 <i; j2++) {

						if (comprobar[j2] == carton) {
							bueno = true;
							total++;
						} else
							j2++;
					}
					j++;
				}

				if (total == 15) {
					System.out.println("Felicidades tu carton ha sido ppremiado");
					seguir = false;

				} else {
					System.out.println("Lo siento tu carton no ha sido premiadp");
					seguir = false;
				}
			}else if(recogida==2) {
				seguir=false;
			}
		
		System.out.println("tu programa ha termindao");
	}

}
