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
		
		System.out.println("Estamos a quantos meses das suas últimas férias?");
		ferias = leia.nextInt();

		if (ferias == 11)
		{
			System.out.println("Suas férias iram vencer em breve. Veja com o RH quando você pode tira-lás");
			System.out.println("Seu salário bruto é: " +salario+ "E você receberá: R$5.144,80 pelas suas férias");
		}
		else if (ferias < 11)
		{
			int falta = 12 - ferias;
			System.out.println("Suas férias ainda não venceram. Você ainda tem tempo " +falta+ " meses para se planejar.");
		}
		
		return ferias;
	}
	
	public String infos()
	{
		salario = 5000.00;
		String descricao = "Funcionário: " +nome+ ".\nSalário: " +salario;
		return descricao;
	}
	
}
