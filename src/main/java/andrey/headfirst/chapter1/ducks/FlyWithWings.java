package andrey.headfirst.chapter1.ducks;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'am flying");
    }
}
