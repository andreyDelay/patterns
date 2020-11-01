package andrey.patterns.behavioral.command;

public class TurnOff implements Command {
    ElectronicDevice theDevice;

    public TurnOff(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }
}
