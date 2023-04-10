package Exemplo1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Interpreter somar = new Somar(new Numero(1), new Numero(4));
	        System.out.println(somar.interpretar());
	        Interpreter subtrair = new Subtrair(somar, new Numero(2));
	        System.out.println(subtrair.interpretar());
	}

}
