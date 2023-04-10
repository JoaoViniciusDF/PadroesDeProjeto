package Exemplo2;

public class Cliente {
private Processador processador;

		Cliente( ){
			this.processador = processador;
		}
		
		public void enviarRequisicao(Processador processador) {
			processador.processarRequisicao();
		}
}
