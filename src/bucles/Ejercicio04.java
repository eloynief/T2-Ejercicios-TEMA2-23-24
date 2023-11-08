package bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int a,b,masPequeño,mcd = 1;
		
		
		System.out.println("Escribe dos numeros: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		if(a>b) {
			masPequeño=b;
		}
		else {
			masPequeño=a;
		}
		
		
		//comprobar si el numero se puede dividir entre uno de los numeros
		for(int i=masPequeño;i>=1;i--) {
			
			//comprobar si se puede dividir entre los dos numeros
			if (a%i==0&&b%i==0) {
				
				//se multiplica como pasa el el mcd (LA CUENTA) (EL CALCULO)
				mcd*=i;
				
			}
			
			
		}

		//cierre de scanner
		sc.close();
		
	}

}
