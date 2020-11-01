package andrey.patterns.behavioral.mediator.secondimplementation;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Button button = new Button(mediator);
        Fan fan = new Fan(mediator);
        mediator.registerButton(button);
        mediator.registerFan(fan);
        mediator.registerPowerSupplier(new PowerSupplier());

        button.press();
        button.press();



    }
}
