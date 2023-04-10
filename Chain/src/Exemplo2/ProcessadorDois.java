package Exemplo2;

public class ProcessadorDois implements Processador{
private Processador sucessor;

	ProcessadorDois (Processador sucessor){
		this.sucessor = sucessor;
	}

	public void processarRequisicao() {
		System.out.println("Requisição passada para etapa 3");
		sucessor.processarRequisicao();
	}

}
