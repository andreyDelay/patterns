package andrey.patterns.behavioral.command;

public class TurnVolumeUIp implements Command {
    ElectronicDevice theDevice;

    public TurnVolumeUIp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }
}
