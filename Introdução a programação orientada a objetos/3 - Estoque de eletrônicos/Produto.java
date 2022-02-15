import java.util.Scanner;

public class Produto {
	
	private String nomeProduto;
	private int id;
	
	int quantidade, estoque;
	double valor;
	Scanner leia = new Scanner(System.in);
	
	public Produto(String nomeProduto, int id)
	{
		this.nomeProduto = nomeProduto;
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public double custo(double valor)
	{
		
		estoque = 100;
		
		System.out.println("Bem vindo ao estoque");
		System.out.println("Qual produto deseja consultar? ");
		id = leia.nextInt();
		System.out.println("Deseja realizar \n1.Retirada\n2.Entrada");
		int op = leia.nextInt();
		
		if(op == 1) {
			System.out.println("Quantos produtos deseja retirar?");
			quantidade = leia.nextInt();
			valor =  estoque - quantidade;
			
			if(valor < 0)
			{
				System.out.println("Não foi possível realizar a retirada. O valor digitado é superior a quantidade existente no estoque");
			}
			else if (valor == 0)
			{
				System.out.println("Todos os produtos do estoque foram retirados");
			}
			else
			{
				System.out.println("Produtos retirados com sucesso.\nRestantes: "+valor);
			}
		}
		
		else if(op == 2) {
			System.out.println("Quantos produtos deseja adicionar?");
			quantidade = leia.nextInt();
			valor =  estoque + quantidade;
			System.out.println("Produtos adicionados com sucesso.\nEstoque atualizado: "+valor);

		}
		else
		{
			System.err.println("Dados incorretos");
		}
		
		
		return valor;
	}
	
	public String infos()
	{
		String descricao = "Produto: " +nomeProduto+ "\nCódigo: " +id;
		return descricao;
	}
	
	

}
