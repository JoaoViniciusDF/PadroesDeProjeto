package Exemplo1;

public class Granola extends ItemDecorator{
	private Food food;

	public Granola(Food food) {
		this.food = food;
	}

	@Override
	public void getDescricao() {
		cost();
		food.getDescricao();
	}

	@Override
	public void cost() {
		System.out.println("Açai com granola");
	}

}
