import java.util.Scanner;

public class Exercicio1A_Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[6];
		int soma = 0;
		
		numeros[0] = 1;
		numeros[1] = 0;
		numeros[2] = 5;
		numeros[3] = -2;
		numeros[4] = -5;
		numeros[5] = 7;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Vetor antes: ");
		for(int x = 0; x < 6; x++)
		{
			System.out.println(numeros[x]);
			
			if(x == 0 || x == 1 || x == 5)
			{
				soma = numeros[x] + soma;
			}
		}
		
		numeros[4] = 100;
		
		System.out.println("Vetor depois: ");
		for(int x = 0; x < 6; x++)
		{
			System.out.println(numeros[x]);
		}
		
		System.out.println("Soma dos valores das posições [0], [1], [5] do vetor " +soma);
		
		
	}

}
