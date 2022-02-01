
public class Animal_Super {

	String nome;
	String idade;
	String peso;
	String tutor;
	
	public Animal_Super(String nome, String idade, String peso, String tutor)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.tutor = tutor;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

}
