import java.util.Scanner;

public class Exercicio5_DOWHILE {
	
	// Crie um programa que leia um n�mero do teclado at� que encontre um
	//n�mero igual a zero. No final, mostre a soma dos n�meros
	//digitados.(DO...WHILE)
	
	public static void main(String[] args) {

		Scanner L = new Scanner(System.in);
		
		float numero;
		float soma=0;
		
		do
		{
			System.out.println("Digite um n�mero ");
			numero = L.nextFloat();
			soma = soma+numero;
				
		}while(numero > 0);
		System.out.println("A soma dos n�meros digitados � " +soma);
		
	}

}
