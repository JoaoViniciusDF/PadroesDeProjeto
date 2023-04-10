package Exemplo1;

public class Numero implements Interpreter{

	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public int interpretar() {
	
		return this.numero;
	}
	
	
}
