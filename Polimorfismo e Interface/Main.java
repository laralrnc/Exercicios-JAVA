
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro Cachorro = new Cachorro("", "", "", "");
		Cavalo Cavalo = new Cavalo("", "", "", "");
		Preguica Preguica = new Preguica("", "", "", "");
		
		int n = (int) (Math.random()*3.0);
		
		System.out.println("\nO programa sorteia três animais e emite o som dele");
		System.out.println("\nO número escolhido foi: "+n);
		
		switch(n)
		{
		case 0: System.out.println("Animal "+Cachorro.getNome() +". Som: "+ Cachorro.getSom()); 
				break;
		case 1: System.out.println("Animal "+Cavalo.getNome() +". Som: "+ Cavalo.getSom()); 
				break;
		case 2: System.out.println("Animal "+Preguica.getNome() +". Som: "+ Preguica.getSom()); 
				break;
		default: System.out.println("\nErro inesperado...");
		
		}
		
	}

}
