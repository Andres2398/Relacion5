package ejercicio6;

import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Suponiendo que un array contiene los dígitos de un número entero y que la dirección
		//de cada elemento indica la posición del dígito en el número, calcular el número
		//almacenado en el array. 

		int [] v = new int [7];
		
		Random r= new Random();
		
		
		for (int i = 0; i < v.length; i++) {
			v[i]=r.nextInt(10);
			System.out.println("{" + v[i]+ "} " );
		}
			
			long multiplicar=1;
			long suma=0;
			System.out.println(v.length);
			for (int i = v.length-1; i>=0; i--) {
				
				suma+=v[i]*multiplicar;
				multiplicar*=10;
				
			}
			System.out.println(suma);
			
		}
	}


