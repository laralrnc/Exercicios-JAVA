import java.util.Scanner;

public class Exercicio4_IFELSE {

	//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par 
	//exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        float n;
        Scanner L = new Scanner (System.in);
        
        System.out.println("Digite um n�mero qualquer ");
        n = L.nextFloat();
        
        if( n % 2 == 0) 
        {
        	System.out.println("O n�mero digitado � par e sua raiz quadrada � " +Math.sqrt(n));
        }
        else
        {
        	System.out.println("O n�mero digitado � �mpar e seu quadrado � " +Math.pow(n, 2));
        }
        
	}

}
