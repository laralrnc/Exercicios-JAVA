import java.util.Scanner;

public class Paciente {
	
	String nome;
	int sintoma = 0;
	Scanner L = new Scanner (System.in);
	
	public String alta(String alta)
	{
		
		do 
		{
			System.out.println("Digite o nome do paciente: ");
			nome = L.nextLine();
			System.out.println("O paciente est� apresentando sintomas de covid-19?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			sintoma = L.nextInt();
			
			if (sintoma == 1)
			{
				System.out.println("O paciente est� apresentando alguns destes sintomas?");
				System.out.println("� Dificuldade em respirar");
				System.out.println("� Dor ou press�o persistente no peito");
				System.out.println("� Nova confus�o");
				System.out.println("� Incapacidade de acordar ou permanecer acordado");
				System.out.println("� Pele, l�bios ou unhas p�lidos, cinzentos ou\r\n"
						+ "azulados, dependendo do tom da pele");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				int op = L.nextInt();
				
				if(op == 1)
				{
					System.out.println("O paciente est� apresentando sintomas de graves de covid-19, procure cuidados m�dicos imediatamente");
					System.exit(0);
				}
				
				System.out.println("O paciente est� apresentando alguns destes sintomas?");
				System.out.println("� Tosse");
				System.out.println("� Febre ou calafrios");
				System.out.println("� Nova perda de paladar\r\n"
						+ "ou olfato");
				System.out.println("� V�mitos ou diarreia");
				System.out.println("� Dores musculares ou\r\n"
						+ "no corpo");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				int op2 = L.nextInt();
				
				if(op2 == 1)
				{
					System.out.println("O paciente est� apresentando sintomas leves de covid-19, procure se manter isolado por no m�nimo 14 dias\r\n"
							+ "Caso os sintomas se agravem ou persistam por mais de 14 dias procure um m�dico");
					System.exit(0);
				}
				
			}	
		}while (sintoma == 1);
		
		return alta;
	}

}
