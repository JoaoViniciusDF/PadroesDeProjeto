package Exemplo1;

public class Frete {
public double peso;
public String tipo;

	Frete(double peso, String tipo){
		this.peso= peso;
		this.tipo = tipo;
	}
	
	public double calcularFrete() {
		double resultado = 0.0;
		
		if(tipo == "FreteGratis") {
			FreteModalidade teste = new FreteGratis();
			resultado= teste.calcularFrete(peso);
		}
		else if(tipo == "Sedex"){
			FreteModalidade teste = new Sedex();
			resultado= teste.calcularFrete(peso);
		}
		return resultado;
	}

}
