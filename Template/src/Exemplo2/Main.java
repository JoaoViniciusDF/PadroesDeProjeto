package Exemplo2;

public class Main {

	public static void main(String[] args) {
		ClasseAbstrata c = new ClasseConcreta();
		c.metodoTemplate();
		
		
		ClasseAbstrata d = new ClasseConcretaDiferente();
		d.metodoTemplate();
	}

}
