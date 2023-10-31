package conditionals;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num=0,r1,r2,suma;
		
		
		
		
		//valores random
		r1=(int) (Math.random()*100);
		
		r2=(int) (Math.random()*100);
		

		suma=r1+r2;
		
		System.out.println(suma);

		System.out.println("escribe el numero que crees que es la suma: ");
		
		num=sc.nextInt();
		
		//si el numero esta enre 1 y 99
		if(num==suma) {
			System.out.println("acertado");
		}
		
		else {
			System.out.println("tonto");
		}
		
		

		//cierre de scanner
		sc.close();
		
	}

}
