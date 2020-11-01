package andrey.patterns.behavioral.strategy.ducks;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'am flying");
    }
}
