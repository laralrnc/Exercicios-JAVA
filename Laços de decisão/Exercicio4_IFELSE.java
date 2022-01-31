import java.util.Scanner;

public class Exercicio4_IFELSE {

	//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par 
	//exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        float n;
        Scanner L = new Scanner (System.in);
        
        System.out.println("Digite um número qualquer ");
        n = L.nextFloat();
        
        if( n % 2 == 0) 
        {
        	System.out.println("O número digitado é par e sua raiz quadrada é " +Math.sqrt(n));
        }
        else
        {
        	System.out.println("O número digitado é ímpar e seu quadrado é " +Math.pow(n, 2));
        }
        
	}

}
