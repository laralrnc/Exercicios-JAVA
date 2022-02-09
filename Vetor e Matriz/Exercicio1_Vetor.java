import java.util.Scanner;

public class Exercicio1_Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[5];
		int maior = 0;
		
		Scanner L = new Scanner(System.in);
		
		for(int x = 0; x < 5; x++)
		{
			System.out.println("Digite um número: ");
			numeros[x] = L.nextInt();
			
			if(numeros[x] > maior)
			{
				maior = numeros [x];
			}
			else
			{
				maior = maior;
			}
		}
		
		System.out.println("Maior número do vetor: ");
		System.out.println(maior);
		
		System.out.println("Números do vetor: ");
		for(int x = 0; x < 5; x++)
		{
			
			System.out.println(numeros[x]);
			
		}
		
	}

}
