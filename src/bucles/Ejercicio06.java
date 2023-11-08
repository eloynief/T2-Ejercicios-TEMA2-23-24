package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);

		int n = 0;

		//try para comprobar si el valor introducido es correcto
		try {

			//pide por pantalla que introduzcamos un numero
			System.out.println("escribe un numero n: ");

			n=sc.nextInt();
			
		}
		//si el valor introducido no es correcto, hace las instrucciones del catch
		catch(InputMismatchException e) {
			System.err.println("El valor introducido no es correcto");
		}
		
		//for para recorrer los valores
		for(int i = 1;i<=n;i++) {
			
			//imprime los *
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
		}

		

		//cierre de scanner
		sc.close();
		
	}

}
