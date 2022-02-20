import java.util.Scanner;

public class Conta {
	
	double salario;
	double conta;
	
	Scanner leia = new Scanner (System.in);
	
	public double pagamentos(double saldo)
	{
		System.out.println("Bem-vindo ao seu banco");
		System.out.println("Qual o valor do seu salário");
		salario = leia.nextDouble();
		saldo = salario;
		
		do
		{
			System.out.println("\nEntre com o valor da conta que deseja pagar:");
			conta = leia.nextDouble();
			System.out.println("_____________________________________________");
		
			if(conta>0)
			{
			saldo = saldo - conta;
				if(saldo < 0.0)
				{
					System.out.println("Saldo insuficiente");
					System.exit(0);
				}
				else
				{
					System.out.println("Conta paga com sucesso seu saldo agora é R$: " +saldo);
				}
			}
		}
		while(saldo > 0.0);
		
		return saldo;
	}

	public double getConta() {
		return conta;
	}

	public void setConta(double conta) {
		this.conta = conta;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

}
