import java.util.Scanner;

public class Exercicio4_Matriz {

	// 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça
	// ao usuário um menu de opções:
	// (1) somar as duas matrizes
	// (2) subtrair a primeira matriz da segunda
	// (3) adicionar uma constante as duas matrizes
	// (4) imprimir as matrizes
	// Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na
	// terceira opção o valor
	// da constante deve ser lido e o resultado da adição da constante deve ser
	// armazenado na própria matriz.

	public static void main(String[] args) {

		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		int l, c, cont, op;

		Scanner L = new Scanner(System.in);

		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				System.out.println("Entre com M1: ");
				m1[l][c] = L.nextFloat();

			}
		}
		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				System.out.println("Entre com M2: ");
				m2[l][c] = L.nextFloat();
			}
		}

		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("1- Somar as duas matrizes");
			System.out.println("2- Subtrair a primeira matriz da segunda ");
			System.out.println("3- Adicionar uma constante as duas matrizes");
			System.out.println("4- Imprimir as matrizes");
			System.out.println("0- Encerrar");
			op = L.nextInt();

			if(op>=1 && op<=4) 
			{
				
			switch (op) {
			case 1:

				for (l = 0; l < 2; l++) {
					for (c = 0; c < 2; c++) {
						System.out.print("\t" + (m3[l][c] = m1[l][c] + m2[l][c]));
					}
				}
				break;

			case 2:

				for (l = 0; l < 2; l++) {
					for (c = 0; c < 2; c++) {
						System.out.print("\t" + (m3[l][c] = m1[l][c] - m2[l][c]));
					}
				}
				break;

			case 3:

				System.out.println("Entre com o valor da constante ");
				cont = L.nextInt();

				for (l = 0; l < 2; l++) {
					for (c = 0; c < 2; c++) {

						m1[l][c] += cont;
						m2[l][c] += cont;

						System.out.println("Resultado da soma (matriz 1) " + m1[l][c]);
						System.out.println("Resultado da soma (matriz 2) " + m2[l][c]);
					}
				}
				break;

			case 4:

				for (l = 0; l < 2; l++) {
					for (c = 0; c < 2; c++) {

						System.out.print("\t" + m1[l][c]);

					}
				}
				for (l = 0; l < 2; l++) {
					for (c = 0; c < 2; c++) {

						System.out.print("\t" + m2[l][c]);

					}
				}

				break;

			}
			}
			else if (op ==0)
			{
				System.out.println("Programa finalizado");
				System.exit(0);
			}
			else
			{
				System.out.println("Opção invalída");
			}

		} 
		while (op != 0);
	}

}
