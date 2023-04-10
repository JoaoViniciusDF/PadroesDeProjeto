package Exemplo2;

public class ProcessadorN implements Processador{

	private Processador sucessor;

	ProcessadorN (Processador sucessor){
		this.sucessor = sucessor;
	}
	public void processarRequisicao() {
		System.out.println("Requisição verificada na etapa 3");
	}

}
