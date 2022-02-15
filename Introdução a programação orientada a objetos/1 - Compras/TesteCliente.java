package Aula31012022;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Geraldo Vedrossi",1234);
		
		
		cliente1.comprar();
		
		System.out.println("\n"+cliente1.getInfo());
	}

}

