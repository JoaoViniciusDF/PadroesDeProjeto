package Exemplo1;

public class Main {

	public static void main(String[] args) {
		Frete frete = new Frete(1.0,"Sedex");
		Frete frete2 = new Frete(3.0,"FreteGratis");
		
	
		System.out.println(frete.calcularFrete());
		System.out.println(frete2.calcularFrete());
	}

}
