package ejercicio11;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		//Averiguar si el valor de un entero, se encuentra o no en dos arrays indicando la 
		//posición o posiciones. 
		
		int[] v = new int [20];
		int[] x = new int [20];
		Random r= new Random();
		int random;
		
		for (int i = 0; i < x.length; i++) {
			random=r.nextInt();
			v[i]=random;
			x[i]=random;
			
		}
		
		System.out.println("dame un valor");
		Scanner sc = new Scanner(System.in);
		int numero=sc.nextInt();
		posicion x=
		for (int i = 0; i < v.length; i++) {
			if (v[i]==numero) {
				
			}
			
				
			for (int j = 0; j < x.length; j++) {
				if (x[i]==numero) {
						
					}
				}
				
			}
		}
		
		
		
		
		
		
	}
	
	
}
