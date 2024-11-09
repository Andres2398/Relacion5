package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// obtener un array como producto de otro por un entero
		
		System.out.println("introduce el numero de casillas de un array");
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] v = new int [n];
		
		
		System.out.println("introduce un numero para calcular ek nuevo array");
		int n1=sc.nextInt();
		int multiplicacion = n*n1;
		
		
 		int x[]= new int [multiplicacion];
 		
 		System.out.println(x.length);
		

	}

}
