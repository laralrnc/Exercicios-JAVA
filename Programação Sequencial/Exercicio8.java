import java.util.Scanner;

public class Exercicio8 {
	/*
	8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor. */
	
	public static void main (String []args) {
		
		float custoF,porF,porD,custoC;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O programa caulca o valor de um carro para o consumidor\n");
		System.out.println("Digite o custo de f�brica do carro");
		custoF = leia.nextFloat();
		
		porF = (custoF * 45) / 100; 
		porD = (custoF * 28) / 100; 
		
		custoC = custoF + porD + porF;
		
		System.out.println("O custo do ve�culo para o consumidor � " + custoC);
		
		
	}
}
