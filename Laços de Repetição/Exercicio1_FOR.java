import java.util.Scanner;

/*
 *  Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 
	obtemos resto = 5. (FOR)
 */
public class Exercicio1_FOR {
	
	public static void main (String []args) {

	int num;
	
	
	for(num = 1000; num <=1999; num++)
	{
		if (num % 11 == 5)
		{
			System.out.println("\t" +num);
		}
	}
	
	
}
}
