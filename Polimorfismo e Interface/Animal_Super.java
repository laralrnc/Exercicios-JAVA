
public class Animal_Super {

	String nomeAnimal;
	String idade;
	String peso;
	String tutor;
	String nome;
	String som;
	
	
	Animal_Super(String nome, String idade, String peso, String tutor)
	{
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.tutor = tutor;
	}
	
	String getNomeAnimal()
	{
		return nomeAnimal;
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
