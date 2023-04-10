package Exemplo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Janela janelaDecorada = DecoradorBarraVertical(new JanelaSimples());
			janelaDecorada.draw();
		 */
		
		Food food = new Banana(null);;
		Food itemDecorator1 = new Morango(food);
		Food itemDecorator2 = new  Granola(itemDecorator1);
		
		itemDecorator1.getDescricao();
		itemDecorator2.getDescricao();
	}

}
