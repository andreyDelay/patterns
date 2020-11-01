package andrey.patterns.behavioral.visitor;

public class SupermarketCustomerB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
