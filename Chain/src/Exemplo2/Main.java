package Exemplo2;

public class Main {

	public static void main(String[] args) {
		Cliente x = new Cliente();

		Processador p3 = new ProcessadorN(null);
		Processador p2 = new ProcessadorDois(p3);
		Processador p1 = new ProcessadorUm(p2);

		x.enviarRequisicao(p1);
	}

}
