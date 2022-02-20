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
			System.out.println("O paciente está apresentando sintomas de covid-19?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			sintoma = L.nextInt();
			
			if (sintoma == 1)
			{
				System.out.println("O paciente está apresentando alguns destes sintomas?");
				System.out.println("• Dificuldade em respirar");
				System.out.println("• Dor ou pressão persistente no peito");
				System.out.println("• Nova confusão");
				System.out.println("• Incapacidade de acordar ou permanecer acordado");
				System.out.println("• Pele, lábios ou unhas pálidos, cinzentos ou\r\n"
						+ "azulados, dependendo do tom da pele");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				int op = L.nextInt();
				
				if(op == 1)
				{
					System.out.println("O paciente está apresentando sintomas de graves de covid-19, procure cuidados médicos imediatamente");
					System.exit(0);
				}
				
				System.out.println("O paciente está apresentando alguns destes sintomas?");
				System.out.println("• Tosse");
				System.out.println("• Febre ou calafrios");
				System.out.println("• Nova perda de paladar\r\n"
						+ "ou olfato");
				System.out.println("• Vómitos ou diarreia");
				System.out.println("• Dores musculares ou\r\n"
						+ "no corpo");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				int op2 = L.nextInt();
				
				if(op2 == 1)
				{
					System.out.println("O paciente está apresentando sintomas leves de covid-19, procure se manter isolado por no mínimo 14 dias\r\n"
							+ "Caso os sintomas se agravem ou persistam por mais de 14 dias procure um médico");
					System.exit(0);
				}
				
			}	
		}while (sintoma == 1);
		
		return alta;
	}

}
