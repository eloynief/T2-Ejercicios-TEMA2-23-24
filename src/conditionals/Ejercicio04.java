package conditionals;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		// variable para guardar un número entero
		int num, uni, dec;
		
		
		// Le decimos al usuario que introduzca un número
		System.out.print("Introduce el número: ");

		
		// Comando para introducir el primer número
		num = sc.nextInt();
		
		
		
		//comprobamos si el numero esta entre 1 y 99
		if (num>=1&&num<=99) {
			
			//al haber comprobado el numero, podemos estar seguro de que podemos hacer el 
			uni=num%10;
			dec=num/10;
			

			switch(uni) {
			
			}

			
		}
		else {
			System.out.println("El numero no es valido");
		}
		
		//cierre de scanner
		sc.close();
		
	}

}
