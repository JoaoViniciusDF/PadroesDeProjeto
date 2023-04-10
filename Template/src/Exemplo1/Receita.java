package Exemplo1;

public abstract class Receita {

	final void receita() {
		System.out.println("\nReceita:");
		ferverAgua();
		misturar();
		despejar();
		acrescentar();
	}
	final void ferverAgua() {
		System.out.println("Ferver a Água");
	}
		final void despejar() {
			System.out.println("Despejar o líquido na xícara");
	}
		
	protected abstract void misturar();
	protected abstract void acrescentar();
}
