package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Dado el número entero colocar cada dígito como elemento de un array según la
		// posición que le corresponda en el número.

		System.out.println("Dame un numero");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int n2 = numero;
		int digitos = 0;
		
		//Sacar total de digitos del numero
		
		while (numero > 0) {
			digitos++;
			numero /= 10;

		}
		
		
		int[] v = new int[digitos];
		
		//rellenar array conforme a los digitos del numero de izquierda a derecha 
		// ejemplo 54 primero se rellena el 4 y luego el 5 
		for (int i = v.length - 1; i >= 0; i--) {
			v[i] = n2 % 10;
			n2 /= 10;
		}
		for (int i = 0; i < v.length; i++) {
			System.out.print("{" + v[i] + "} ");
		}

	}

}
