import java.util.Scanner;

public class Exercicio1_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		int maior = 0;
		
		System.out.println("Digite um n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		num3 = leia.nextInt();
		
		maior = num1;
		
		if(num2 > num1)
		{
			maior = num2;
		}
		if (num3 > maior)
		{
			maior = num3;
		}
		
		System.out.println("O maior n�mero �: " +maior);
		
	}

}
