package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//
		int a,b,masGrande,mcm = 1;
		
		//
		System.out.println("Escribe dos numeros: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		//
		if(a<b) {
			masGrande=b;
		}
		else {
			masGrande=a;
		}
		
		
		//comprobar si el numero se puede dividir entre uno de los numeros
		for(int i=masGrande;i>=1;i--) {
			
			//comprobar si se puede multiplicar por uno de los dos numeros
			if (a%i==0||b%i==0) {
				
				//se multiplica como pasa el el mcd (LA CUENTA) (EL CALCULO)
				mcm*=i;
				
			}
			
			
		}
		
		//
		System.err.println("El minimo comun multiplor es: "+mcm);
		
		//cierre de scanner
		sc.close();
		
	}

}
