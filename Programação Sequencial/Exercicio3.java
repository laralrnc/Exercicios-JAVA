import java.util.Scanner;

public class Exercicio3 {
	
	//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	
	public static void main(String []args) {
		
		int DSegundo,DHora,DMinuto;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O programa lerá a duração de um evento em segundos e converterá para horas, minutos e segundos\n");
		System.out.println("Digite a duração do evento em segundos");
		DSegundo = leia.nextInt();
		
		DHora = DSegundo / 3600;
		DMinuto = (DSegundo % 3600) / 60;
		DSegundo = (DSegundo % 3600) % 60;
		
		System.out.println("O evento durou " +DHora+ " horas " +DMinuto+ " minutos e " +DSegundo+ " segundos");

	}

}
