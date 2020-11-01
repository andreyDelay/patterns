package andrey.patterns.behavioral.command;

public class TurnVolumeDown implements Command {
    ElectronicDevice theDevice;

    public TurnVolumeDown(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeDown();
    }
}
