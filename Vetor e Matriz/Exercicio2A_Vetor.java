import java.util.Scanner;

public class Exercicio2A_Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[6];
		int par = 0;
		int impar = 0;
		int somaPar = 0;
		int somaImpar = 0;
		
		Scanner L = new Scanner(System.in);
		
		for(int x = 0; x < 6; x++)
		{
			System.out.println("Digite um n�mero: ");
			numeros[x] = L.nextInt();
			
			if (numeros[x] % 2 == 0)
			{
				par++;
				somaPar = numeros[x] + somaPar;
			}
			else
			{
				impar++;
				somaImpar = numeros[x] + somaImpar;
			}
		}
		
	System.out.println("O vetor possu� " +par+ " n�meros pares");
	System.out.println("O vetor possu� " +impar+ " n�meros �mpares");
	System.out.println("Soma dos " +par+ " n�meros pares: " +somaPar);
	System.out.println("Soma dos " +impar+ " n�meros pares: " +somaImpar);
	}

}
