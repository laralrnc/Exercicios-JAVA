import java.util.Scanner;

public class Exercicio7 {
	
	/*Um sistema de equações lineares do tipo:
	 * pode ser resolvido segundo mostrado abaixo :
	 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
		valores de x e y.

		x = c.e-b.f/a.e-b.b ; y=a.f-c.d/a.e-b.d */
	
	public static void main(String []args) {
		
		float a,b,c,d,e,f,x,y;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Programa que resolve equações lineares\n");
		System.out.println("Digite o valor de A ");
		a = leia.nextFloat();
		
		System.out.println("Digite o valor de B ");
		b = leia.nextFloat();
		
		System.out.println("Digite o valor de C ");
		c = leia.nextFloat();
		
		System.out.println("Digite o valor de D ");
		d = leia.nextFloat();
		
		System.out.println("Digite o valor de E ");
		e = leia.nextFloat();
		
		System.out.println("Digite o valor de F ");
		f = leia.nextFloat();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de X " +x+ " e o valor de y é " +y);
		
	}
}
