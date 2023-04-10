package Exemplo2;
public interface PizzaBuilderInterface {
	
    PizzaBuilderInterface molho(String molho);
    PizzaBuilderInterface queijo(String queijo);
    PizzaBuilderInterface cogumelos(String cogumelos);
    PizzaBuilderInterface pimentoes(String pimentoes);
    
    Pizza build();
    
}

