import java.util.Scanner;

public class Avi�o {

	private String piloto;
	private int codigoAviao;
	int passagens, passageiros, total;
	
	Scanner leia = new Scanner(System.in);
	
	public Avi�o (String piloto, int codigoAviao)
	{
		this.piloto = piloto;
		this.codigoAviao = codigoAviao;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCodigoAviao() {
		return codigoAviao;
	}

	public void setCodigoAviao(int codigoAviao) {
		this.codigoAviao = codigoAviao;
	}
	
	public Scanner getLeia()
	{
		return leia;
	}

	public int getPassagens() {
		return passagens;
	}

	public void setPassagens(int passagens) {
		this.passagens = passagens;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	
	public int Capacidade(int total)
	{
		
		
		System.out.println("Qual a capacidade do avi�o " + codigoAviao);
		passageiros = leia.nextInt();
		System.out.println("Quantas passagens foram vendidas para o voo " + codigoAviao);
		passagens = leia.nextInt();
		
		total = passageiros - passagens;
		if (total < 0)
		{
			System.out.println("A capacidade do avi�o foi excedida. " +total+ "passageiros ter�o que ser realocados para outro voo");
		}
		else if(total == 0)
		{
			System.out.println("A capacidade do avi�o foi completa. Nenhuma passagem pode ser vendida para o voo " +codigoAviao);
		}
		else
		{
			System.out.println("A capacidade do avi�o n�o est� completa. Podemos vender mais " +total+ " passagens");
		}
		
		return total;
		
	}
	
	public String Descricao()
	{
		System.out.println("________________________________________________________");
		String Descricao = "Piloto: " +piloto + " \nC�digo do Avi�o: " +codigoAviao;
		return Descricao;
		
	}
	
	
	
}
