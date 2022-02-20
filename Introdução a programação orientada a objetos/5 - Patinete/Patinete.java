import java.util.Scanner;

public class Patinete {
	
	private String nome;
	int idade;
	private int cor;
	int confirma��o;
	
	Scanner leia = new Scanner(System.in);
	
	public Patinete (String nome, int cor)
	{
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public int getConfirma��o() {
		return confirma��o;
	}

	public void setConfirma��o(int confirma��o) {
		this.confirma��o = confirma��o;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	
	public String compra(String mensagem)
	{
		
		System.out.println("Qual produto deseja comprar?");
		String produto = leia.nextLine();
		
		System.out.println("O produto � para presente? Responda com 'sim' ou 'n�o'");
		String presente = leia.nextLine();
		
		System.out.println("Quantos anos tem a pessoa que usar� o " +produto);
		idade = leia.nextInt();
		
		
		if(idade < 5) 
		{
			System.out.println("Qual a cor deseja escolher para o" + produto+ "?");
			System.out.println("1 - Azul e Laranja");
			System.out.println("2 - Verde e Rosa");
			cor = leia.nextInt();
		
			switch(cor)
			{
				case 1:
					System.out.println("PATINETE PARA CRIAN�A B1 500");
					System.out.println("Descri��o: Rodas luminosas p/ maior DIVERS�O! Trotinete de 3 rodas, f�cil\n "
							+ "para crian�as de 80 cm a 1,20 m se divertirem a descobrir das primeiras sensa��es de deslize\n "
							+ "DIVERTIDA com as rodas luminosas e uma aprendizagem ainda mais f�cil gra�as ao sistema de\n "
							+ "dire��o patenteado, � plataforma e ao trav�o em mat�ria dupla que ajudam ao correto posicionamento do p�!");
					System.out.println("____________________________");
					System.out.println("R$399,99");
					System.out.println("Deseja finalizar a compra?");
					System.out.println("1 - Sim");
					System.out.println("2 - N�o");
					confirma��o = leia.nextInt();
					
					if (confirma��o == 1)
					{
						System.out.println("Compra finalizada");
					}
					else if (confirma��o == 2)
					{
						System.out.println("Agradecemos pela sua visita ao nosso site, na pr�xima visita esperamos que a compra seja finalizada");
					}
					break;
				case 2:
					System.out.println("PATINETE PARA CRIAN�A B1 500");
					System.out.println("Descri��o: Rodas luminosas p/ maior DIVERS�O! Trotinete de 3 rodas, f�cil\n "
							+ "para crian�as de 80 cm a 1,20 m se divertirem a descobrir das primeiras sensa��es de deslize\n "
							+ "DIVERTIDA com as rodas luminosas e uma aprendizagem ainda mais f�cil gra�as ao sistema de\n "
							+ "dire��o patenteado, � plataforma e ao trav�o em mat�ria dupla que ajudam ao correto posicionamento do p�!");
					System.out.println("____________________________");
					System.out.println("DE R$399,99 POR R$349,99");
					System.out.println("Deseja finalizar a compra?");
					System.out.println("1 - Sim");
					System.out.println("2 - N�o");
					confirma��o = leia.nextInt();
					
					if (confirma��o == 1)
					{
						System.out.println("Compra finalizada");
					}
					else if (confirma��o == 2)
					{
						System.out.println("Agradecemos pela sua visita ao nosso site, na pr�xima visita esperamos que a compra seja finalizada");
					}
					break;
					
			}	
		}
		else if(idade > 12 ) 
		{
			System.out.println("Qual a cor deseja escolher para o" + produto+ "?");
			System.out.println("1 - Preto e cinza");
			System.out.println("2 - Prata e cinza");
			cor = leia.nextInt();
		
			switch(cor)
			{
				case 1:
					System.out.println("PATINETE TOWN 7XL OXELO");
					System.out.println("Desenvolvido para deslocamento urbano curto de at� 2km. Indicado para usu�rios com "
							+ "altura entre 1,45m e 1,95m. Capacidade m�xima de 100kg. O patinete Town 7XL � o companheiro ideal "
							+ "para os deslocamentos urbanos. "
							+ "Com as suspens�es traseira e dianteita voc� ter� o m�ximo em conforto no deslocamento do dia a dia.");
					System.out.println("____________________________");
					System.out.println("R$999,99");
					System.out.println("Deseja finalizar a compra?");
					System.out.println("1 - Sim");
					System.out.println("2 - N�o");
					confirma��o = leia.nextInt();
					
					if (confirma��o == 1)
					{
						System.out.println("Compra finalizada");
					}
					else if (confirma��o == 2)
					{
						System.out.println("Agradecemos pela sua visita ao nosso site, na pr�xima visita esperamos que a compra seja finalizada");
					}
					break;
					
				case 2:
					System.out.println("PATINETE MID 9");
					System.out.println("Desenvolvido para os passeios ou trajetos curtos na cidade (menos de 2 km) e "
							+ "para as pessoas que medem entre 1m45 e 1m85. +R�PIDO, +LONGE, +CONFORTO para crian�as dos 9 aos 14 anos! "
							+ "A trotinete MID tem suspens�o � "
							+ "frente e rodas grandes. E ainda: o trav�o no guiador para melhor controlo da velocidade e maior conforto.");
					System.out.println("____________________________");
					System.out.println("R$749,99");
					System.out.println("Deseja finalizar a compra?");
					System.out.println("1 - Sim");
					System.out.println("2 - N�o");
					confirma��o = leia.nextInt();
					
					if (confirma��o == 1)
					{
						System.out.println("Compra finalizada");
					}
					else if (confirma��o == 2)
					{
						System.out.println("Agradecemos pela sua visita ao nosso site, na pr�xima visita esperamos que a compra seja finalizada");
					}
					break;
					
			}
			
				
		}
		else
		{
			System.out.println("Infelizmente n�o temos estoque para esta faixa et�ria.");
		}
		
		return mensagem;
	}	
}

