package Exemplo1;

public class ConcreteElementB implements IElement {
	public void Accept(IVisitor visitor)
    {
        visitor.VisitConcreteElementB(this);
    }
	public String SpecialMethodOfConcreteElementB()
    {
        return "B";
    }
}
