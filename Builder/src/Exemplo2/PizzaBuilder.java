package Exemplo2;

public class PizzaBuilder implements PizzaBuilderInterface {
	
    private String molho;
    private String queijo;
    private String cogumelos;
    private String pimentoes;

    @Override
    public PizzaBuilderInterface molho(String molho) {
        this.molho = molho;
        return this;
    }

    @Override
    public PizzaBuilderInterface queijo(String queijo) {
        this.queijo = queijo;
        return this;
    }

    @Override
    public PizzaBuilderInterface cogumelos(String cogumelos) {
        this.cogumelos = cogumelos;
        return this;
    }

    @Override
    public PizzaBuilderInterface pimentoes(String pimentoes) {
        this.pimentoes = pimentoes;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(molho, queijo, cogumelos, pimentoes);
        
    }
}




