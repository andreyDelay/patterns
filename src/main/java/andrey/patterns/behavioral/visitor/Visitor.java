package andrey.patterns.behavioral.visitor;

public interface Visitor {
    void visitConcreteElementA(SupermarketCustomerA elementA);
    void visitConcreteElementB(SupermarketCustomerB elementB);
}
