package ejercicio13;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Escribir un método que genere una tabla unidimensional con los 100 primeros
		// números primos. Escribir un programa que presente cada uno de sus elementos
		// en
		// pantalla, presentando 4 números en cada fila.

		int divisor = 2;
		boolean primo = true;
		int numero = 2;
		int[] primos = new int[100];

		int i = 0;
		while (i < primos.length) {
			primo = true;
			divisor = 2;

			while (divisor <= Math.sqrt(numero) && primo == true) {
				if (numero % divisor == 0)
					primo = false;
				else
					divisor++;
			}

			if (primo == true) {
				primos[i] = numero;
					i++;
				}
				numero++;

			}

			for (int j = 0; j < primos.length; j++) {
				System.out.println(primos[j]);
			}

			// System.out.println("{2} ");
			for (int j = 0; j < primos.length; j++) {
				if (j % 4 != 0)
					System.out.print("{" + primos[j] + "} ");
				else {
					System.out.print("\n {" + primos[j]+ "} ");

				}

			}

		}
	}

