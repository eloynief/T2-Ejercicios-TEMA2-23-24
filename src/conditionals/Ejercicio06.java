package conditionals;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num=0,r1,r2;
		
		
		System.out.println("escribe un numero: ");
		
		num=sc.nextInt();
		
		//valores random
		r1=(int) (Math.random()*100);
		
		r2=(int) (Math.random()*100);
		
		
		//si el numero esta enre 1 y 99
		if(num>0&&num<100) {
			
		}

		//cierre de scanner
		sc.close();
		
	}

}
