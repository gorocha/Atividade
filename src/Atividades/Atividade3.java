package Atividades;

import java.util.Scanner;

class Atividade3 {
	
	public static float media(float n1, float n2, float n3, float n4, float n5) {
		return ( n1 + n2 + n3 + n4 + n5 ) / 5;
	}

	public static void main(String[] args) {
		
		Scanner a3 = new Scanner(System.in);
		
		float a = 0;
		System.out.println("Digite o primeiro n�mero: ");
		a = a3.nextFloat();
		float b = 0;
		System.out.println("Digite o segundo n�mero: ");
		b = a3.nextFloat();
		float c = 0;
		System.out.println("Digite o terceiro n�mero: ");
		c = a3.nextFloat();
		float d = 0;
		System.out.println("Digite o quarto n�mero: ");
		d = a3.nextFloat();
		float e = 0;
		System.out.println("Digite o quinto n�mero: ");
		e = a3.nextFloat();
		
		System.out.println("A m�dia � de " + media(a,b,c,d,e));


	}

}
