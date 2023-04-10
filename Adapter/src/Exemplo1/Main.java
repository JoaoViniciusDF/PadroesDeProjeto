package Exemplo1;

public class Main {

	public static void main(String[] args) {
		Ganso ganso = new Ganso();
		PeruAustraliano peru = new PeruAustraliano();
		AdapterPato adPato = new AdapterPato(ganso);
		peru.cacarejar();
		ganso.grasnar();
		adPato.cacarejar();
		
		//suponha que o cliente queira implementar a interface Peru tanto para o PeruAustraliano tanto para o Marreco
		//Criar um adaptador Pato implementando Peru
		//Dentro da classe adaptador objeto Pato

	}


}
