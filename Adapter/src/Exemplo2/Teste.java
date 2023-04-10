package Exemplo2;
public class Teste {
	
	/*
	  Exemplo de uso do padrão Adapter.
	  A aplicação espera objetos que implementem a interface "Forma",
	  mas a classe "Circulo" não implementa essa interface.
	  Para resolver isso, usamos o adaptador "AdaptadorCirculo",
	  que implementa a interface "Forma" e se comunica com a classe "Circulo",
	  permitindo que a aplicação desenhe círculos.
	  
	 */
	
   public static void main(String[] args) {
      Forma forma = new AdaptadorCirculo(new Circulo());
      forma.desenhar();
      
   }
}

