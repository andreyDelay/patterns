package andrey.patterns.behavioral.mediator.secondimplementation;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
        System.out.println("Кондиционер включён!");
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
        System.out.println("Кондиционер выключен!");
    }

    public boolean isOn() {
        return isOn;
    }
}
