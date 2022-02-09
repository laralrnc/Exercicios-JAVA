import java.util.Scanner;

public class Exercicio6_DOWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		double media = 0.0;
		int soma = 0;
		double mediaA = 0.0;
		
		
		do
		{
			System.out.println("Digite um número");
			num = leia.nextInt();
			
			if (num % 3 == 0)
			{
				media++;
				soma = num + soma;
			}
			
		}while(num > 0);
		
		mediaA = soma / (media - 1);
		
		System.out.println("Média nos números múltiplos de três " +mediaA);
	}
	
	

}
