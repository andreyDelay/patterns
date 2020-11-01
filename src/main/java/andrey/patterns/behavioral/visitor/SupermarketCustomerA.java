package andrey.patterns.behavioral.visitor;

public class SupermarketCustomerA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
