package bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int n=1,numCorrecto=0,numFallo=0;
		
		//comprueba si el numero que se ha escrito no es 0
		while(n!=0) {
			//pide que escribaos numero
			System.out.println("Escribe el numero: ");
			
			n=sc.nextInt();
			
			//se comprueba si el numero escrito es correcto o no
			if(n>0) {
				//aumenta el numero de numeros escritos
				numCorrecto++;
			}
			else if(n<0) {
				//aumenta el numero de numeros fallados
				numFallo++;
			}
			
			
		}
		
		//

		//cierre de scanner
		sc.close();
		
	}

}
