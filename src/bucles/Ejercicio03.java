package bucles;

import java.util.Scanner;

public class Ejercicio03 {

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
		catch(Exception e) {
			System.err.println("El valor introducido no es correcto");
		}
		
		for(int i = 1;i<=n;i++) {
			
			
			for (int j;)
			
		}

		//cierre de scanner
		sc.close();
		
	}

}
