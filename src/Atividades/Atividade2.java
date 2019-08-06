package Atividades;

import java.util.Scanner;

class Atividade2 {

	public static void main(String[] args) {
		
		Scanner a2 = new Scanner(System.in);
		
		int a = 0;
		System.out.println("Digite o primeiro número: ");
		a = a2.nextInt();
		int b = 0;
		System.out.println("Digite o segundo número: ");
		b = a2.nextInt();
		int c = 0;
		System.out.println("Digite o terceiro número: ");
		c = a2.nextInt();
		
		if (a > b & b > c) {
			System.out.println("A ordem descrescente é " + a + " , " + b + " , " + c);
		}
		else if(a > c & c > b) {
			System.out.println("A ordem descrescente é " + a + " , " + c + " , " + b);
		}
		else if (b > a & a > c) {
			System.out.println("A ordem descrescente é " + b + " , " + a + " , " + c);
		}
		else if(b > c & c > a) {
			System.out.println("A ordem descrescente é " + b + " , " + c + " , " + a);
		}
		else if (c > a & a > b) {
			System.out.println("A ordem descrescente é " + c + " , " + a + " , " + b);
		}
		else {
			System.out.println("A ordem descrescente é " + c + " , " + b + " , " + a);
		}
		

	}

}
