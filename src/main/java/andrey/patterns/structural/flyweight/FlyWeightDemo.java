package andrey.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightDemo {
    public static void main(String[] args) {
        LampFactory lampFactory = new LampFactory();

        List<Lamp> lamps = new ArrayList<>();

        lamps.add(lampFactory.getLamp(LampType.STAND_LAMP));
        lamps.add(lampFactory.getLamp(LampType.STAND_LAMP));
        lamps.add(lampFactory.getLamp(LampType.STAND_LAMP));
        lamps.add(lampFactory.getLamp(LampType.STAND_LAMP));

        lamps.add(lampFactory.getLamp(LampType.LUSTRE, "100"));
        lamps.add(lampFactory.getLamp(LampType.LUSTRE, "100"));
        lamps.add(lampFactory.getLamp(LampType.LUSTRE, "100"));
        lamps.add(lampFactory.getLamp(LampType.LUSTRE, "100"));

        lamps.add(lampFactory.getLamp(LampType.DESKTOP));
        lamps.add(lampFactory.getLamp(LampType.DESKTOP));
        lamps.add(lampFactory.getLamp(LampType.DESKTOP));
        lamps.add(lampFactory.getLamp(LampType.DESKTOP));

        lamps.add(lampFactory.getLamp(LampType.SCONCE, "40"));
        lamps.add(lampFactory.getLamp(LampType.SCONCE, "40"));
        lamps.add(lampFactory.getLamp(LampType.SCONCE, "40"));
        lamps.add(lampFactory.getLamp(LampType.SCONCE, "40"));


        for (Lamp lamp : lamps) {
            lamp.light();
        }
    }
}
