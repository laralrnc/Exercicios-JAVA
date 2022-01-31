import java.util.Scanner;

public class Exercicio2 {
	
	//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.

	public static void main (String []args) {
		
		int IAnos,IMeses,IDias;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O sistema lerá sua idade em dias e converterá para anos, meses e dias\n");
		System.out.println("Digite sua idade em dias ");
		IDias = leia.nextInt();
		
		IAnos = IDias / 365;
		IMeses = (IDias % 365) / 30;
		IDias = (IDias % 365) % 30;
		
		System.out.println("Sua idade exata é " +IAnos+ " anos " +IMeses+ " meses e " +IDias+ " dias");
		
	}
}
