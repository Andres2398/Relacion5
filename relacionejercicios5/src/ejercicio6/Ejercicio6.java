package ejercicio6;



public class Ejercicio6 {

	public static void main(String[] args) {
		//Suponiendo que un array contiene los dígitos de un número entero y que la dirección
		//de cada elemento indica la posición del dígito en el número, calcular el número
		//almacenado en el array. 

		int [] v = {5,8,9,6,8,5,7};
			
			int multiplicar=1;
			int suma=0;
			System.out.println(v.length);
			for (int i = v.length-1; i>=0; i--) {
				System.out.println(v[i]);
				suma+=v[i]*multiplicar;
				multiplicar*=10;
				
			}
			System.out.println(suma);
			
		}
		
		

	}


