package andrey.patterns.behavioral.visitor;

public class Security implements Visitor{
    @Override
    public void visitConcreteElementA(SupermarketCustomerA elementA) {
        System.out.println("Проверить ничего ли не украл покупатель Андрей");
    }

    @Override
    public void visitConcreteElementB(SupermarketCustomerB elementB) {
        System.out.println("Проверить ничего ли не украл покупатель Владимир");
    }
}
