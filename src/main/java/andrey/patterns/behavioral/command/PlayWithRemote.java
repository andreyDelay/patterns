package andrey.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnOn onCommand = new TurnOn(newDevice);
        DeviceButton button = new DeviceButton(onCommand);
        button.press();

        Television TV = new Television();
        Radio radio = new Radio();

        List<ElectronicDevice> devices = new ArrayList<>();

        devices.add(TV);
        devices.add(radio);

        TurnAllOff turnAllOff = new TurnAllOff(devices);
        DeviceButton turnOff = new DeviceButton(turnAllOff);
        turnOff.press();
    }
}
