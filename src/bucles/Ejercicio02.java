package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//
		int n = 0;
		int primo=0;
		
		//try para comprobar si el valor introducido es correcto
		try {

			//pide por pantalla que introduzcamos un numero
			System.out.println("escribe un numero n: ");

			n=sc.nextInt();
			
		}
		//si el valor introducido no es correcto, hace las instrucciones del catch
		catch(Exception e) {
			System.err.println("El valor introducido no es correcto");
		}
		
		//se recorre un bucle para recorrer todos los numeros
		for(int i=1;i<=n;i++) {

			primo=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					primo++;
				}
			}

			//si el numero solo se puede dividir entre si mismo y 1
			if(primo==2||i==1) {
				System.out.println(i);
			}
			
		}
		
//		for (int j = 2; j < i; j++) {
//      if (n % i == 0) {
//          esPrimo = false; // Si es divisible por algún número, no es primo.
//          System.out.println(j+"es primo");
//          break; // Salir del bucle una vez que se determine que no es primo.
//      }
//  }
//	
		/**
		 *  if (numero <= 1) {
            esPrimo = false; // Los números menores o iguales a 1 no son primos.
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Si es divisible por algún número, no es primo.
                    break; // Salir del bucle una vez que se determine que no es primo.
                }
            }
        }
		 */
		
		//cierre de scanner
		sc.close();
		
	}

}
