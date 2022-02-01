import java.util.Scanner;

public class Preguica extends Animal_Super {
	
	private String som = " emite sons de alta-frequ�ncia pelas narinas";
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
		
		System.out.println("Digite o nome da sua pregui�a ");
		nome = leia.nextLine();
		System.out.println("Digite o seu nome ");
		tutor = leia.nextLine();
		System.out.println("Digite o peso da sua pregui�a ");
		peso = leia.nextLine();
		System.out.println("Digite a idade da sua pregui�a ");
		idade = leia.nextLine();
		return nome;
		
	}
	
	public void ExibirPreguica()
	{
		System.out.println("O pregui�a do(a) " +getTutor()+ " se chama " +getNome()+ " tem " +getPeso()+ " quilos e " +getIdade()+ " anos");
	}
	
	public void ExibirSom()
	{
		System.out.println("O pregui�a do(a) " +getTutor()+ som);
	}
	
	public void ExibirArvore()
	{
		System.out.println("O pregui�a do(a) " +getTutor()+ " possu� h�bitos arbor�colas, entretanto descem ao "
				+ "solo para realizar suas necessidades fisiol�gicas ou quando n�o h� conex�o entre as �rvores nas �reas de mata.");
	}
	
	
	

}