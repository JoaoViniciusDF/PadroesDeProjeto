package Exemplo1;

public class Morango extends ItemDecorator{
	private Food food;

	public Morango(Food food) {
		this.food = food;
	}

	@Override
	public void getDescricao() {
		cost();
		food.getDescricao();
	}
	
	@Override
	public void cost() {
		System.out.println("Açai com Morango");		
	}


}
