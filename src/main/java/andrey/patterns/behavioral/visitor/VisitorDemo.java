package andrey.patterns.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Element customer1 = new SupermarketCustomerA();
        Element customer2 = new SupermarketCustomerB();
        CashRegister cashRegister = new CashRegister();

        customer1.accept(cashRegister);
        customer2.accept(cashRegister);

        Security security = new Security();

        customer1.accept(security);
        customer2.accept(security);
    }
}
