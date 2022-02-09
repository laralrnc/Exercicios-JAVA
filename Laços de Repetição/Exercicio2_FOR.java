import java.util.Scanner;

public class Exercicio2_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		int x;
		int par = 0;
		int impar = 0 ;
		
		
		for(x = 0; x <10; x++)
		{
			
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0)
			{
				par = par +1;
			}
			
			else
			{
				impar = impar +1;
			}
		}
		
		System.out.println("Quantidade de números pares " +par);
		System.out.println("Quantidade de números ímpares " +impar);

	}

}
