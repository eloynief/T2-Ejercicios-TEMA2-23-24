package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		// variables para guardar la hora, minuto, segundo y segundos para incrementar
		int hora=0,min=0,sec = 0,incrementar=0;
		
		
		//try de horas
		
		try {

			// Le decimos al usuario que introduzca un número
			System.out.print("Introduce las horas: ");

			
			// Comando para introducir la hora
			hora = sc.nextInt();
			
		}
		//captura el error del valor escrito
		catch(InputMismatchException e){
			System.out.println("El valor introducido es incorrecto");
			System.out.println(e.getMessage());
		}
		
		

		
		//try de minutos
		
		try {

			// Le decimos al usuario que introduzca un número
			System.out.print("Introduce los minutos: ");

			
			// Comando para introducir los min
			min = sc.nextInt();
			
		}
		//captura el error del valor escrito
		catch(InputMismatchException e){
			System.out.println("El valor introducido es incorrecto");
			System.out.println(e.getMessage());
		}
		
		
		//try de segundos
		
		try {

			// Le decimos al usuario que introduzca un número
			System.out.print("Introduce los segundos: ");

			
			// Comando para introducir los sec
			sec = sc.nextInt();
			
		}
		//captura el error del valor escrito
		catch(InputMismatchException e){
			System.out.println("El valor introducido es incorrecto");
			System.out.println(e.getMessage());
		}
		

		//try de la cantidad de segundos a incrementar
		
		try {

			// Le decimos al usuario que introduzca la cantidad de segundos que se van a incrementar
			System.out.print("Introduce el número de segundos a incrementar: ");

			
			// Comando para introducir el incremento de las numros
			incrementar = sc.nextInt();
			
		}
		//captura el error del valor escrito
		catch(InputMismatchException e){
			System.out.println("El valor introducido es incorrecto");
			System.out.println(e.getMessage());
		}
		
		
		
		//se aumenta la cantidad de segundos
		sec+=incrementar;
		
		//si los valores son válidos

			//si el numero de segundos supera 59, aumenta la cantidad de minutos y se reduce en 60 la de segundos 
			while(sec>=60) {
				min+=1;
				sec-=60;
			}
			
			//si el numero de minutos supera 59, aumenta la cantidad de horas y se reduce en 60 la de segundos 
			while(min>=60) {
				hora+=1;
				min-=60;
			}
			
			
			//imprime la hora
			System.out.println(hora+":"+min+":"+sec);
			
		
		
		
		
		
		

		//cierre de scanner
		sc.close();
		
	}

}
