import java.util.Scanner;

public class Exercicio3_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m1 = new int[3][3];
		int linha, coluna, maiorD = 0;

		Scanner L = new Scanner(System.in);
		
		for(linha = 0; linha < 3; linha++)
		{
			for(coluna = 0; coluna< 3; coluna++)
			{
				System.out.println("Digite um número para preencher a matriz 3X3: ");
				m1[linha][coluna] = L.nextInt();
				
				if(m1[linha][coluna] > 10)
				{
					maiorD++;
				}
				else
				{
					maiorD = maiorD;
				}
				
			}
		}
		
		System.out.println("A matriz 3X3 possui " +maiorD+ " valores maiores que dez");

	}

}
