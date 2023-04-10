package Exemplo1;

public class Banana extends ItemDecorator{
	private Food food;
	
	public Banana(Food food) {
		this.food = food;
	}

	@Override
	public void getDescricao() {
		cost();
		food.getDescricao();
	}

	@Override
	public void cost() {
		System.out.println("Açai com banana");
	}


}
