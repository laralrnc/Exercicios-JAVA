
public class Cachorro extends Animal_Super implements Animais {

	Cachorro(String nome, String idade, String peso, String tutor) {
		super(nome, idade, peso, tutor);
		nomeAnimal = " Cachorro";
		som = "AUAUAUA";
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