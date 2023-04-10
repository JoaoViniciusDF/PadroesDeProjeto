package Exemplo2;
public class AdaptadorCirculo implements Forma {
	
   private Circulo circulo;
   
   public AdaptadorCirculo(Circulo circulo) {
      this.circulo = circulo;
   }
   
   @Override
   public void desenhar() {
      circulo.desenharCirculo();
   }
}

