import java.util.Scanner;

public class Funcionario {

	private String nome;
	private double salario;
	int ferias;
	double salarioFerias;
	
	Scanner leia = new Scanner(System.in);
	
	public Funcionario(String nome, double salario)
	{
		this.nome = nome;
		this.salario = salario;
	}
	
	public int CalculoFerias(int ferias)
	{
		
		System.out.println("Estamos a quantos meses das suas �ltimas f�rias?");
		ferias = leia.nextInt();

		if (ferias == 11)
		{
			System.out.println("Suas f�rias iram vencer em breve. Veja com o RH quando voc� pode tira-l�s");
			System.out.println("Seu sal�rio bruto �: " +salario+ "E voc� receber�: R$5.144,80 pelas suas f�rias");
		}
		else if (ferias < 11)
		{
			int falta = 12 - ferias;
			System.out.println("Suas f�rias ainda n�o venceram. Voc� ainda tem tempo " +falta+ " meses para se planejar.");
		}
		
		return ferias;
	}
	
	public String infos()
	{
		salario = 5000.00;
		String descricao = "Funcion�rio: " +nome+ ".\nSal�rio: " +salario;
		return descricao;
	}
	
}
