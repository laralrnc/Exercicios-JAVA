import java.util.Scanner;

public class Preguica extends Animal_Super {
	
	private String som = " emite sons de alta-frequência pelas narinas";
	private String arvore;
	
	Scanner leia = new Scanner(System.in);
	
	public Preguica(String nome, String idade, String peso, String tutor, String som, String arvore)
	{
		super(nome, idade, peso,tutor);
		this.som=som;
		this.arvore=arvore;
	}
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getArvore() {
		return arvore;
	}

	public void setArvore(String arvore) {
		this.arvore = arvore;
	}
	
	public  String InfoPreguica()
	{
		
		System.out.println("Digite o nome da sua preguiça ");
		nome = leia.nextLine();
		System.out.println("Digite o seu nome ");
		tutor = leia.nextLine();
		System.out.println("Digite o peso da sua preguiça ");
		peso = leia.nextLine();
		System.out.println("Digite a idade da sua preguiça ");
		idade = leia.nextLine();
		return nome;
		
	}
	
	public void ExibirPreguica()
	{
		System.out.println("O preguiça do(a) " +getTutor()+ " se chama " +getNome()+ " tem " +getPeso()+ " quilos e " +getIdade()+ " anos");
	}
	
	public void ExibirSom()
	{
		System.out.println("O preguiça do(a) " +getTutor()+ som);
	}
	
	public void ExibirArvore()
	{
		System.out.println("O preguiça do(a) " +getTutor()+ " possuí hábitos arborícolas, entretanto descem ao "
				+ "solo para realizar suas necessidades fisiológicas ou quando não há conexão entre as árvores nas áreas de mata.");
	}
	
	
	

}