package Exemplo1;

public class Main {

    public static void main(String[] args) {
    	
        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");
        MenuItem item3 = new MenuItem("Item 3");
        
        MenuItem[] itens = {item1, item2, item3};
        MenuIterator iterator = new MenuIterator(itens);
        
        while(iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.nome);
        }
        
    }

}
