import java.util.Scanner;

public class Exercicio5_CASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que mostre um Menu com opções de um cardápio de restaurante
		 * para uma pessoa. A pessoa vai escolher o prato desejado: Após escolher o
		 * prato, o programa deverá fazer uma pergunta ao usuário, se ele aceita pagar a
		 * gorjeta do garçom 10% sobre o valor do prato. Se o usuário aceitar, mostrar o
		 * valor final (valor do prato + 10%), caso contrário, mostrar o valor final
		 * (somente o valor do prato). Codigo Prato Valor 1 Picanha 25,00 2 Lasanha
		 * 20,00 3 Strogonoff 18,00 4 Bife Acebolado 15,00 5 Pão com ovo 5,00
		 * 
		 */

		int op;
		int gor;

		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha um dos pratos do nosso cardápio: ");
		System.out.println("1 - Picanha. R$25,00");
		System.out.println("2 - Lasanha R$20,00 ");
		System.out.println("3 - Strogonoff R$18,00 ");
		System.out.println("4 - Bife Acebolado R$15,00 ");
		System.out.println("5 - Pão com ovo R$5,00 ");
		op = leia.nextInt();

		switch (op) {
		case 1:
			System.out.println("Deseja pagar a gorjeta do garçom (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 25 + (25 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$25,00");
			}
			break;
		case 2:
			System.out.println("Deseja pagar a gorjeta do garçom (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 22 + (22 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$22,00");
			}
			break;
		case 3:
			System.out.println("Deseja pagar a gorjeta do garçom (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 18 + (18 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$18,00");
			}
			break;
		case 4:
			System.out.println("Deseja pagar a gorjeta do garçom (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			gor = leia.nextInt();

			if (gor == 1) {
				double total = 15 + (15 * 0.10);
				System.out.println("Valor do prato + 10%: " + total);
			} else {
				System.out.println("Valor do prato: R$15,00");
			}
			break;
		case 5:
			System.out.println("Deseja pagar a gorjeta do garçom (10%)? ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
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
