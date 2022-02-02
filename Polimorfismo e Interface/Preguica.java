
public class Preguica extends Animal_Super implements Animais {

	Preguica(String nome, String idade, String peso, String tutor) {
		super(nome, idade, peso, tutor);
		nomeAnimal = "Preguiça";
		som = "Emite sons de alta-frequência pelas narinas";
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