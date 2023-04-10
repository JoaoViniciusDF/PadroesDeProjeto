package Exemplo1;


public class ConcreteVisitor2 implements IVisitor{
	public void VisitConcreteElementA(ConcreteElementA element)
    {
        System.out.println("Visitor Concreto 2");
    }
public void VisitConcreteElementB(ConcreteElementB element)
    {
    System.out.println("Visitor Concreto 2");
    }
}
