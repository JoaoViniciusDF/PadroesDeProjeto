package Exemplo2;

public abstract class ClasseAbstrata {

	final void metodoTemplate() {
		System.out.println("\nTemplate ta aqui");
		passoA();
		passoB();
	}
	protected abstract void passoA();
	protected abstract void passoB();
}
