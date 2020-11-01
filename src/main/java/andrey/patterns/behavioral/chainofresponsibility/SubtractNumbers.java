package andrey.patterns.behavioral.chainofresponsibility;

public class SubtractNumbers implements Chain{

    private Chain nextInChain;

    @Override
    public void seNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "sub") {
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " +
                    (request.getNumber1() - request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
