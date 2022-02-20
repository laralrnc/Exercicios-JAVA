import java.util.Scanner;

public class Patinete {
	
	private String nome;
	int idade;
	private int cor;
	int confirmação;
	
	Scanner leia = new Scanner(System.in);
	
	public Patinete (String nome, int cor)
	{
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public int getConfirmação() {
		return confirmação;
	}

	public void setConfirmação(int confirmação) {
		this.confirmação = confirmação;
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
		
		System.out.println("O produto é para presente? Responda com 'sim' ou 'não'");
		String presente = leia.nextLine();
		
		System.out.println("Quantos anos tem a pessoa que usará o " +produto);
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
					System.out.println("PATINETE PARA CRIANÇA B1 500");
					System.out.println("Descrição: Rodas luminosas p/ maior DIVERSÃO! Trotinete de 3 rodas, fácil\n "
							+ "para crianças de 80 cm a 1,20 m se divertirem a descobrir das primeiras sensações de deslize\n "
							+ "DIVERTIDA com as rodas luminosas e uma aprendizagem ainda mais fácil graças ao sistema de\n "
							+ "direção patenteado, à plataforma e ao travão em matéria dupla que ajudam ao correto posicionamento do pé!");
					System.out.println("____________________________");
					System.out.println("R$399,99");
					System.out.println("Deseja finalizar a compra?");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					confirmação = leia.nextInt();
					
					if (confirmação == 1)
					{
						System.out.println("Compra finalizada");
					}
					else if (confirmação == 2)
					{
						System.out.println("Agradecemos pela sua visita ao nosso site, na próxima visita esperamos que a compra seja finalizada");
					}
					break;
				case 2:
					System.out.println("PATINETE PARA CRIANÇA B1 500");
					System.out.println("Descrição: Rodas luminosas p/ maior DIVERSÃO! Trotinete de 3 rodas, fácil\n "
							+ "para crianças de 80 cm a 1,20 m se divertirem a descobrir das primeiras sensações de deslize\n "
							+ "DIVERTIDA com as rodas luminosas e uma aprendizagem ainda mais fácil graças ao sistema de\n "
							+ "direção patenteado, à plataforma e ao travão em matéria dupla que ajudam ao correto posicionamento do pé!");
					System.out.println("____________________________");
					System.out.println("DE R$399,99 POR R$349,99");
					System.out.println("Deseja finalizar a compra?");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					confirmação = leia.nextInt();
					
					if (confirmação == 1)
					{
						System.out.println("Compra finalizada");
					}
					else if (confirmação == 2)
					{
						System.out.println("Agradecemos pela sua visita ao nosso site, na próxima visita esperamos que a compra seja finalizada");
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
					System.out.println("Desenvolvido para deslocamento urbano curto de até 2km. Indicado para usuários com "
							+ "altura entre 1,45m e 1,95m. Capacidade máxima de 100kg. O patinete Town 7XL é o companheiro ideal "
							+ "para os deslocamentos urbanos. "
							+ "Com as suspensões traseira e dianteita você terá o máximo em conforto no deslocamento do dia a dia.");
					System.out.println("____________________________");
					System.out.println("R$999,99");
					System.out.println("Deseja finalizar a compra?");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					confirmação = leia.nextInt();
					
					if (confirmação == 1)
					{
						System.out.println("Compra finalizada");
					}
					else if (confirmação == 2)
					{
						System.out.println("Agradecemos pela sua visita ao nosso site, na próxima visita esperamos que a compra seja finalizada");
					}
					break;
					
				case 2:
					System.out.println("PATINETE MID 9");
					System.out.println("Desenvolvido para os passeios ou trajetos curtos na cidade (menos de 2 km) e "
							+ "para as pessoas que medem entre 1m45 e 1m85. +RÁPIDO, +LONGE, +CONFORTO para crianças dos 9 aos 14 anos! "
							+ "A trotinete MID tem suspensão à "
							+ "frente e rodas grandes. E ainda: o travão no guiador para melhor controlo da velocidade e maior conforto.");
					System.out.println("____________________________");
					System.out.println("R$749,99");
					System.out.println("Deseja finalizar a compra?");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					confirmação = leia.nextInt();
					
					if (confirmação == 1)
					{
						System.out.println("Compra finalizada");
					}
					else if (confirmação == 2)
					{
						System.out.println("Agradecemos pela sua visita ao nosso site, na próxima visita esperamos que a compra seja finalizada");
					}
					break;
					
			}
			
				
		}
		else
		{
			System.out.println("Infelizmente não temos estoque para esta faixa etária.");
		}
		
		return mensagem;
	}	
}

