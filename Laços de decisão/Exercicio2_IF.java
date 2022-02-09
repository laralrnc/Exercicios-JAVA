import java.util.Scanner;

public class Exercicio2_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		int p, s, t = 0;
		
		System.out.println("Digite um número: ");
		num1 = leia.nextInt();
		System.out.println("Digite um número: ");
		num2 = leia.nextInt();
		System.out.println("Digite um número: ");
		num3 = leia.nextInt();
		
		t = num1;
		p = num1;
		s = num1;
		
		if(num2 > num1)
		{
			t = num2;
		}
		if (num3 > t)
		{
			t = num3;
		}
		if (num2 < num1)
		{
			p = num2;
		}
		if (num3 < p)
		{
			p = num3;
		}
		if (p < num2 && t > num2)
		{
			s = num2;
		}
		if (p < num3 && t > num3)
		{
			s = num3;
		}
		
		System.out.println("Números organizados em ordem crescente: " +p+ " - " +s+ " - "+t);

		
	}

}