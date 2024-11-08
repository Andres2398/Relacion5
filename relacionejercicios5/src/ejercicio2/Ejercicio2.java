package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Suponiendo un array averiguar si en el se encuentra o no un numero n, e indicar cuantas veces aparace
		
		System.out.println("Introduce la cantidad de digitos que vas a introducir");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int[] v= new int[numero];
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero " + i);
			v[i]=sc.nextInt();
		}
		
		System.out.println("¿Qué numero quieres comprobar?");
		numero=sc.nextInt();
		int contador=0;
		for (int i = 0; i < v.length; i++) {
			
			if (v[i]==numero) {
				contador++;
			}
		}
		System.out.println("tu numero se repite " + contador + " veces");
	}

}
