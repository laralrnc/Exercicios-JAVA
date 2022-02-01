import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner L = new Scanner (System.in);
		Cachorro Cachorro = new Cachorro (null, null, null, null, "AUAUAUA", null, null);
		Cavalo Cavalo = new Cavalo (null, null, null, null, "Hiin in in", null, null);
		Preguica Preguica = new Preguica (null, null, null, null, " emite sons de alta-frequência pelas narinas", null);
		
		System.out.println("O nosso sistema permite o registro de 3 animais");
		System.out.println("1-Cachorro");
		System.out.println("2-Cavalo");
		System.out.println("3-Preguiça");
		System.out.println("Escolha a opçao que deseja registrar");
		int op = L.nextInt();
		System.out.println("*********************************");
		
		if (op>=1 && op<=3) {
		switch (op)
		{
		case 1:
		Cachorro.InfoCao();
		Cachorro.ExibirSom();
		Cachorro.ExibirCachorro();
		Cachorro.ExibirVelocidade();
		System.out.println("*********************************");
		break;
		
		case 2:
		Cavalo.InfoCavalo();
		Cavalo.ExibirSom();
		Cavalo.ExibirCavalo();
		Cavalo.ExibirVelocidade();
		break;
		
		case 3:
		System.out.println("*********************************");
		Preguica.InfoPreguica();
		Preguica.ExibirSom();
		Preguica.ExibirPreguica();
		Preguica.ExibirArvore();
		}
	}
		else
		{
			System.out.println("Opçao invalída");
			System.exit(0);
		}
		
	}

}
