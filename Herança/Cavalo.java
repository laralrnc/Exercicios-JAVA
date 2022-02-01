import java.util.Scanner;

public class Cavalo extends Animal_Super {
	
	private String som = "Hiin in in";
	private String corrida;
	private String raca;
	
	Scanner leia = new Scanner(System.in);
	
	public Cavalo(String nome, String idade, String peso, String tutor, String som, String corrida, String raca)
	{
		super(nome, idade, peso,tutor);
		this.som=som;
		this.corrida=corrida;
		this.raca=raca;
	}
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public String getCorrida() {
		return corrida;
	}

	public void setCorrida(String corrida) {
		this.corrida = corrida;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public  String InfoCavalo()
	{
		
		System.out.println("Digite o nome do seu cavalo ");
		nome = leia.nextLine();
		System.out.println("Digite o seu nome ");
		tutor = leia.nextLine();
		System.out.println("Digite o peso do seu cavalo ");
		peso = leia.nextLine();
		System.out.println("Digite a idade do seu cavalo ");
		idade = leia.nextLine();
		System.out.println("Digite a raça do seu cavalo ");
		raca = leia.nextLine();
		
		return nome;
		
	}
	
	public void ExibirCavalo()
	{
		System.out.println("O cavalo do(a) " +getTutor()+ " se chama " +getNome()+ " tem " +getPeso()+ " quilos e " +getIdade()+ " anos");
	}
	
	public void ExibirSom()
	{
		System.out.println("O cavalo do(a) " +getTutor()+ " produz o som " +som);
	}
	
	public void ExibirVelocidade()
	{
		System.out.println("O cavalo do(a) " +getTutor()+ " pode correr até 88km/h");
	}
	
	
	

}