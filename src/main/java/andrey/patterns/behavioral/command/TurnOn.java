package andrey.patterns.behavioral.command;

public class TurnOn implements Command {
    ElectronicDevice theDevice;

    public TurnOn(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }
}
