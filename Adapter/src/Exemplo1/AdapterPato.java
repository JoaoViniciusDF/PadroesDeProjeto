package Exemplo1;

public class AdapterPato implements Peru {

	private Pato pato;
	
	
	public AdapterPato(Pato pato) {
		this.pato = pato;
	}

	@Override
	public void voar() {
		pato.Planar();
		
	}

	@Override
	public void cacarejar() {
		pato.grasnar();
		
	}

}
