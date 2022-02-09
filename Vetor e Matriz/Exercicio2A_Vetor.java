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
			System.out.println("Digite um número: ");
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
		
	System.out.println("O vetor possuí " +par+ " números pares");
	System.out.println("O vetor possuí " +impar+ " números ímpares");
	System.out.println("Soma dos " +par+ " números pares: " +somaPar);
	System.out.println("Soma dos " +impar+ " números pares: " +somaImpar);
	}

}
