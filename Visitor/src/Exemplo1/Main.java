package Exemplo1;

public class Main {

	public static void main(String[] args) {
		//Despoluir classes de operações desnessessarias

            
        var visitor1 = new ConcreteVisitor1();
        var visitor2 = new ConcreteVisitor2();
        visitor1.VisitConcreteElementA(new ConcreteElementA());
    }
}
