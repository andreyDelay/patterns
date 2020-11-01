package andrey.patterns.behavioral.visitor;

public class CashRegister implements Visitor{
    @Override
    public void visitConcreteElementA(SupermarketCustomerA elementA) {
        System.out.println("Посчитать стоимость товара покупателю Андрей");
    }

    @Override
    public void visitConcreteElementB(SupermarketCustomerB elementB) {
        System.out.println("Посчитать стоимость товара покупателю Владимир");
    }
}
