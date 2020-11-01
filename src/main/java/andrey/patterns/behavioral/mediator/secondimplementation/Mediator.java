package andrey.patterns.behavioral.mediator.secondimplementation;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void registerButton(Button button) {
        this.button = button;
    }

    public void registerFan(Fan fan) {
        this.fan = fan;
    }

    public void registerPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }

}
