package andrey.patterns.behavioral.chainofresponsibility;

public class DivideNumbers implements Chain{

        private Chain nextInChain;

        @Override
        public void seNextChain(Chain nextChain) {
            nextInChain = nextChain;
        }

        @Override
        public void calculate(Numbers request) {
            if (request.getCalculationWanted() == "div") {
                System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " +
                        (request.getNumber1() / request.getNumber2()));
            } else {
                System.out.println("Works only for add, sub, mult, div");
            }
        }
}
