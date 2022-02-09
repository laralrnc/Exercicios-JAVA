import java.util.Scanner;

public class Exercicio4_WHILE {
	
	/*
	 * Uma empresa desenvolveu uma pesquisa para saber as características 
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas 
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era 
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 
	pessoas, calcule e mostre: (WHILE) 
	 o número de pessoas calmas; 
	 o número de mulheres nervosas; 
	 o número de homens agressivos; 
	 o número de outros calmos; 
	 o número de pessoas nervosas com mais de 40 anos; 
	 o número de pessoas calmas com menos de 18 anos.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int sexo;
		int contador = 0;
		int op;
		int contCalma = 0;
		int outrosCalmo = 0;
		int Calmos = 0;
		int MNervosas = 0;
		int QNervosas = 0;
		int HAgressivos = 0;
		
		while (contador <150) 
		{

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("Digite seu gênero: ");
			System.out.println("1 - Feminino");
			System.out.println("2 - Masculino");
			System.out.println("3 - Outro");
			sexo = leia.nextInt();
			System.out.println("Escolha a opção que mais descreve seu estado mental: ");
			System.out.println("1 - Calma(o)");
			System.out.println("2 - Nervosa(o)");
			System.out.println("3 - Agressiva(o)");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				contCalma++; //todos os calmos
				if (sexo == 3)
				{
					outrosCalmo++; //outros calmos
				}
				else if(idade < 18)
				{
					Calmos++; //menores de 18 anos calmos
				}
			break;
			case 2: 
				if(sexo == 1)
				{
					MNervosas++; // Mulheres nervosas
				}
				else if (idade > 40)
				{
					QNervosas++; // Mais quarentas nervosas
				}
			break;
			case 3:
				if (sexo == 2)
				{
					HAgressivos++;
				}
			break;
			
			
			}
			
			
		contador++;		
			
		}
		
		System.out.println("Reultados da pesquisa: ");
		System.out.println("Número de pessoas calmas " +contCalma);
		System.out.println("Número de mulheres nervosas " +MNervosas);
		System.out.println("Número de homens agressivos " +HAgressivos);
		System.out.println("Número de outros calmos " +outrosCalmo);
		System.out.println("Número de pessoas nervosas com mais de 40 anos " +QNervosas);
		System.out.println("Número de pessoas calmas com menos de 18 anos " +Calmos);
		
}
}
