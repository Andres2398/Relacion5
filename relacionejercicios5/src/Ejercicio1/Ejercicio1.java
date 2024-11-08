package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Asignar a cada uno de los elementos de un Array el cuadrado del indice de un elemento
		
		
		
		int numero=0;
		System.out.println("introduce el numero de elementos del array");
		
		Scanner sc =new Scanner(System.in);
		numero=sc.nextInt();
		
		int []v = new int[numero];
		
		for (int i = 0; i < v.length; i++) {
			v[i]=i*i;
			System.out.println("posicion " + i + "= " +  v[i]);
		}	
			
		}
		

	}


