import java.util.Scanner;

public class Exercicio3_IFELSE {

	public static void main(String[] args) {
		//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual 
		//categoria ela se encontra:
		//10-14 infantil
		//15-17 juvenil
		//18-25 adulto
		
		Scanner L = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.println("Digite sua idade e o programa mostrar� qual sua categoria: ");
		nome = L.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = L.nextInt();
		
		if(idade >=10 && idade <=14) 
		{
			System.out.println("Ol� " +nome+ " sua idade � " +idade+ " e voc� est� na categoria infantil");
		}
		else if(idade >=15 && idade <=17) 
		{
			System.out.println("Ol� " +nome+ " sua idade � " +idade+ " e voc� est� na categoria juvenil");
		}
		else if(idade >=18 && idade <=25) 
		{
			System.out.println("Ol� " +nome+ " sua idade � " +idade+ " e voc� est� na categoria adulto");
		}
		else 
		{
			System.out.println("Ol� " +nome+ " sua idade � " +idade+ " e sua idade n�o entra em nenhuma das nossas categorias");
			
		}
		
		
		


	}

}
