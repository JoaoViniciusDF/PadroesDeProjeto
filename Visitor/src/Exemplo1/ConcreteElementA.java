package Exemplo1;

public class ConcreteElementA implements IElement {
	
	@Override
	 public void Accept(IVisitor visitor)
     {
         visitor.VisitConcreteElementA(this);
     }
	public String ExclusiveMethodOfConcreteElementA()
     {
         return "A";
     }


}
