package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		//Obtener la suma de los elementos de un array, multiplicando previamente los
		//elementos pares por uno y los impares por tres. 
		
		System.out.println("Introduce el tamaño del array");
		
		Scanner sc = new Scanner(System.in);
		int tamaño=sc.nextInt();
		
		int [] v = new int [tamaño];
		int numero=0;
		for (int i = 0; i < v.length; i++) {
			System.out.println("introduce el numero " + i + " del array");
			numero=sc.nextInt();
			if (numero%2==0) {
				v[i]=numero;
			}else {
				v[i]=numero*3;
			}
		}
		
		int suma=0;
		for (int i = 0; i < v.length; i++) {
			suma+=v[i];
			
		}
		System.out.println("tus numeros suman " + suma);
	}

}
