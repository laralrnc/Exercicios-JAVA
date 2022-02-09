import java.util.Scanner;

public class Exercicio5_CASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fa�a um programa que mostre um Menu com op��es de um card�pio de restaurante
		 * para uma pessoa. A pessoa vai escolher o prato desejado: Ap�s escolher o
		 * prato, o programa dever� fazer uma pergunta ao usu�rio, se ele aceita pagar a
		 * gorjeta do gar�om 10% sobre o valor do prato. Se o usu�rio aceitar, mostrar o
		 * valor final (valor do prato + 10%), caso contr�rio, mostrar o valor final
		 * (somente o valor do prato). Codigo Prato Valor 1 Picanha 25,00 2 Lasanha
		 * 20,00 3 Strogonoff 18,00 4 Bife Acebolado 15,00 5 P�o com ovo 5,00
		 * 
		 */

		int op;
		int gor;

		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha um dos pratos do nosso card�pio: ");
		System.out.println("1 - Picanha. R$25,00");
		System.out.println("2 - Lasanha R$20,00 ");
		System.out.println("3 - Strogonoff R$18,00 ");
		System.out.println("4 - Bife Acebolado R$15,00 ");
		System.out.println("5 - P�o com ovo R$5,00 ");
		op = leia.nextInt();

		switch (op) {
		case 1:
			System.out.println("Deseja pagar a gorjeta do gar�om (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 25 + (25 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$25,00");
			}
			break;
		case 2:
			System.out.println("Deseja pagar a gorjeta do gar�om (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 22 + (22 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$22,00");
			}
			break;
		case 3:
			System.out.println("Deseja pagar a gorjeta do gar�om (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 18 + (18 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$18,00");
			}
			break;
		case 4:
			System.out.println("Deseja pagar a gorjeta do gar�om (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 15 + (15 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$15,00");
			}
			break;
		case 5:
			System.out.println("Deseja pagar a gorjeta do gar�om (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 5 + (5 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$5,00");
			}
			break;

		}

	}

}
