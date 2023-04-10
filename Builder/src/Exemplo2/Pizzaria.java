package Exemplo2;
public class Pizzaria {
	
    private PizzaBuilder builder;

    public Pizzaria(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza margherita() {
        return builder.molho("tomate")
                .queijo("mozarela")
                .build();
    }

    public Pizza vegetariana() {
        return builder.molho("tomate")
                .queijo("mozarela")
                .cogumelos("champignon")
                .pimentoes("verde")
                .build();
    }
    
    
}


