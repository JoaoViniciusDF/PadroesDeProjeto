package Exemplo1;

public class ReceitaCafe extends Receita{
	
	protected  void misturar() {
		System.out.println("Misturar o café na Água");
	}

	protected  void acrescentar() {
		System.out.println("Acrescentar açúcar");	
		System.out.println("\n----------------Fim da Receita de Café ----------------");
	}
}
