import java.util.Scanner;

public class Exercicio5 {
	
	//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	//respectivamente.
	
	public static void main(String []args) {
		
		Scanner leia = new Scanner (System.in);
		
		float n1,n2,n3,media;
		
		System.out.println("O programa ler� tr�s notas e calcular� a m�dia ponderada\n");
		
		System.out.println("Digite sua primeira nota ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite sua segunda nota ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite sua terceira nota ");
		n3 = leia.nextFloat();
		
		media = ((n1*2)+(n2*3)+(n3*5))/ 10;
		
		System.out.println("Sua m�dia � " +media);

	}
}
