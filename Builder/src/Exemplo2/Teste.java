package Exemplo2;


public class Teste {	

    public static void main(String[] args) {
    	   	
        PizzaBuilder builder = new PizzaBuilder();
        Pizzaria pizzaria = new Pizzaria(builder);

        // Criando uma margherita
        Pizza margherita = pizzaria.margherita();
        System.out.println(margherita.toString());

        // Criando uma vegetariana
        Pizza vegetariana = pizzaria.vegetariana();
        System.out.println(vegetariana.toString());

        // Criando uma pizza personalizada
        Pizza pizzaPersonalizada = builder.molho("tomate")
                .queijo("mozarela")
                .cogumelos("shitake")
                .pimentoes("vermelho")
                .build();
        System.out.println(pizzaPersonalizada.toString());
    	    
    }

}




