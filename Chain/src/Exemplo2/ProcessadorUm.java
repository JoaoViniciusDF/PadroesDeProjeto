package Exemplo2;

public class ProcessadorUm implements Processador{
	private Processador sucessor;
	
	ProcessadorUm(Processador sucessor){
		this.sucessor = sucessor;
	}

	public void processarRequisicao() {
			System.out.println("Iniciada a etapa 1");
			System.out.println("Requisição passada para etapa 2");
			sucessor.processarRequisicao();
	}

}
