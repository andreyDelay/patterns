package andrey.patterns.behavioral.strategy.ducks;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
