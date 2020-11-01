package andrey.patterns.behavioral.chainofresponsibility;

public interface Chain {
    void seNextChain(Chain nextChain);

    void calculate(Numbers request);
}
