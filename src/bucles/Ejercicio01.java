package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		// variables para guardar la hora, minuto, segundo y segundos para incrementar
		int hora,min,sec,incrementar;
		
		
		//try de horas
		
		// Le decimos al usuario que introduzca un número
		System.out.print("Introduce las horas: ");

		
		// Comando para introducir la hora
		hora = sc.nextInt();

		
		//try de minutos
		
		// Le decimos al usuario que introduzca un número
		System.out.print("Introduce los minutos: ");

		
		// Comando para introducir los min
		min = sc.nextInt();
		
		//try de segundos

		// Le decimos al usuario que introduzca un número
		System.out.print("Introduce los segundos: ");

		
		// Comando para introducir los sec
		sec = sc.nextInt();
		

		//try de la cantidad de segundos a incrementar
		
		// Le decimos al usuario que introduzca la cantidad de segundos que se van a incrementar
		System.out.print("Introduce el número de segundos a incrementar: ");

		
		// Comando para introducir el incremento de las numros
		incrementar = sc.nextInt();
		
		
		
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
