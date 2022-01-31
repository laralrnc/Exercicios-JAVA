import java.util.Scanner;

public class Exercicio6 {
	
	//Construa um programa em que, tendo como dados de entrada dois pontos
	//quaisquer no plano, P(x1, y1) e P(x2, y2), calcule a distância entre eles
	
	public static void main(String []args) {
		
		Scanner leia = new Scanner (System.in);
		int x1,x2,y1,y2;
		double d;
		
		System.out.println("O programa calculará a distancia entre dois pontos no plano cartesiano\n");
		
		System.out.println("Digite o valor do ponto x1 ");
		x1 = leia.nextInt();
		
		System.out.println("Digite o val1or do ponto x2 ");
		x2 = leia.nextInt();
		
		System.out.println("Digite o valor do ponto y1 ");
		y1 = leia.nextInt();
		
		System.out.println("Digite o valor do ponto y2 ");
		y2 = leia.nextInt();
		
		d = (int) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
				
	
		System.out.printf("A distância entre os pontos digitados é: %1.2f " ,d);

	}
}