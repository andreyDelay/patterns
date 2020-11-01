package andrey.patterns.behavioral.chainofresponsibility;

public class ChainDemo {
    public static void main(String[] args) {
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.seNextChain(chainCalc2);
        chainCalc2.seNextChain(chainCalc3);
        chainCalc3.seNextChain(chainCalc4);

        Numbers request = new Numbers(4, 2, "div");

        chainCalc1.calculate(request);
    }
}
