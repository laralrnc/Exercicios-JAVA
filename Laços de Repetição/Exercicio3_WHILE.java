import java.util.Scanner;

public class Exercicio3_WHILE {
	
	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	//idade for =-99. (WHILE)

	public static void main (String []args) {
		
		Scanner L = new Scanner(System.in);
		
		int idade;
		int m21 = 0;
		int m50 = 0;
		
		System.out.println("Digite sua idade ");
		idade = L.nextInt();
		
		while (idade<99) 
		{
			System.out.println("Digite sua idade ");
			idade = L.nextInt();
			if(idade < 21) 
			{
			m21++;
			}
			else if(idade > 50)
			{
				m50++;
			}
		}
		
		System.out.println(m21+  " pessoas tem idade menor que 21");
		System.out.println(m50+  " pessoas tem idade maior que 50");
		
		
	}
}
