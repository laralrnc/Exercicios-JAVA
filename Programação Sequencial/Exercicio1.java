import java.util.Scanner;

public class Exercicio1 {
	
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	//dias e mostre-a expressa apenas em dias.
	
	public static void main (String []args) {
		
		int IAnos,IMeses,IDias;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O programa lerá sua idade em anos meses e dias e mostrará sua idade em dias\n");
		
		System.out.println("Digite sua idade em anos ");
		IAnos = leia.nextInt();
		
		System.out.println("Digite sua idade em meses ");
		IMeses = leia.nextInt();
		
		System.out.println("Digite sua idade em dias ");
		IDias = leia.nextInt();
		
		IDias = (IAnos * 365) + (IMeses * 30) + IDias;
		
		System.out.println("\nVocê tem " +IDias+ " de vida");
		
	}

}
