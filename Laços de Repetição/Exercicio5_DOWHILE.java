import java.util.Scanner;

public class Exercicio5_DOWHILE {
	
	// Crie um programa que leia um número do teclado até que encontre um
	//número igual a zero. No final, mostre a soma dos números
	//digitados.(DO...WHILE)
	
	public static void main(String[] args) {

		Scanner L = new Scanner(System.in);
		
		float numero;
		float soma=0;
		
		do
		{
			System.out.println("Digite um número ");
			numero = L.nextFloat();
			soma = soma+numero;
				
		}while(numero > 0);
		System.out.println("A soma dos números digitados é " +soma);
		
	}

}
