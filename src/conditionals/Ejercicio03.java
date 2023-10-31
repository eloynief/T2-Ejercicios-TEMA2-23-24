package conditionals;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		//variable para guardar un número entero
		int comida,animales,kilos,racion;
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce la cantidad de comida que le vas a dar a los animales: ");
		
		//Comando para introducir el primer número el cual representa la comida
		comida = sc.nextInt();
		
		System.out.print("Introduce el número de animales: ");
		//Comando para introducir el segundo número el cual representa los animales
		animales = sc.nextInt();
		
		System.out.print("Introduce los kilos de comida que tienes: ");
		/*Comando para introducir el tercer número el cual representa los kilos.
		Los kilos */
		kilos = sc.nextInt();
		
			//si hay animales
			if (animales>0) {
				racion=comida/animales;
				//si la cantidad de kilos de comida medios son mayores que la comida por la cantidad de animales
				if (kilos>comida*animales) {
					//imprimimos que tenemos suficiente comida para estos
					System.out.print("Tenemos suficientes kilos de comida para los animales");
				}
				else {
				System.out.print("La cantidad correspondiente de comida para cada animal es: " + racion);
				}
			}
			else System.out.print("No hay animales");

		//cierre de scanner
		sc.close();
		
	}

}
