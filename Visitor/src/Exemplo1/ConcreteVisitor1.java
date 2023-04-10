package Exemplo1;


public class ConcreteVisitor1 implements IVisitor {
	
	 public void VisitConcreteElementA(ConcreteElementA element)
     {
         System.out.println("Visitor Concreto1");
     }
public void VisitConcreteElementB(ConcreteElementB element)
 {
     System.out.println("Visitor Concreto1");
     }
}
