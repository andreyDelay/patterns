package andrey.patterns.behavioral.command;

import java.util.List;

public class TurnAllOff implements Command {

    List<ElectronicDevice> deviceList;

    public TurnAllOff(List<ElectronicDevice> deviceList) {
        this.deviceList = deviceList;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : deviceList) {
            device.off();
        }
    }
}
