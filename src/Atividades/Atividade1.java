package Atividades;

import java.util.Scanner;

class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner a1 = new Scanner(System.in);
				
		int a = 0;
		System.out.println("Digite o primeiro n�mero: ");
		a = a1.nextInt();
		int b = 0;
		System.out.println("Digite o segundo n�mero: ");
		b = a1.nextInt();
		int c = 0;
		System.out.println("Digite o terceiro n�mero: ");
		c = a1.nextInt();
		
		if (a < b & b < c) {
			System.out.println("A ordem crescente � " + a + " , " + b + " , " + c);
		}
		else if(a < c & c < b) {
			System.out.println("A ordem crescente � " + a + " , " + c + " , " + b);
		}
		else if (b < a & a < c) {
			System.out.println("A ordem crescente � " + b + " , " + a + " , " + c);
		}
		else if(b < c & c < a) {
			System.out.println("A ordem crescente � " + b + " , " + c + " , " + a);
		}
		else if (c < a & a < b) {
			System.out.println("A ordem crescente � " + c + " , " + a + " , " + b);
		}
		else {
			System.out.println("A ordem crescente � " + c + " , " + b + " , " + a);
		}
		

	}

}
