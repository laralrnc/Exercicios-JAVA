import java.util.Scanner;

public class Exercicio4 {
	
	//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	//calcule a seguinte expressão: D = R + S / 2
	
	public static void main(String []args) {
		
		int A,B,C,D,R,S;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite três números inteiros\n");
		System.out.println("Digite o valor de A ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C ");
		C = leia.nextInt();
			
		R = (int) Math.pow((A+B),2);
		S = (int) Math.pow((C+B),2);
		D = (R+S)/2;
		
		System.out.println("O Resultado de D=R+S/2 é " +D);
	}
}
