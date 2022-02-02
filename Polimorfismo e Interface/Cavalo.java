
public class Cavalo extends Animal_Super implements Animais {

	Cavalo(String nome, String idade, String peso, String tutor) {
		super(nome, idade, peso, tutor);
		nomeAnimal = " Cavalo";
		som = "Hiin in in";
	}

	@Override
	public String getSom() {
		return som;
	}
	
	public String getNome()
	{ // tem na interface
		return nomeAnimal;
	}

	@Override
	public String setSom(String som) {
		// TODO Auto-generated method stub
		return null;
	}


}