package andrey.patterns.structural.flyweight;

import java.util.HashMap;

public class LampFactory {
    private static final HashMap<String, Lamp> lamps = new HashMap<>();

    public Lamp getLamp(LampType type, String requiredWattage) {
        String key = type.toString();
        Lamp lamp = lamps.get(key);

        if (lamp != null) {
            return lamp;
        } else {
            lamp = recognizeLamp(type);
            lamp.setWattage(requiredWattage);
            lamps.put(type.toString(), lamp);
            System.out.println("Создана лампа типа " + type.toString() + ". Вольтаж " + lamp.getWattage());
        }
        return lamp;
    }

    public Lamp getLamp(LampType type) {
        String key = type.toString();
        Lamp lamp = lamps.get(key);

        if (lamp != null) {
            return lamp;
        } else {
            lamp = recognizeLamp(type);
            lamps.put(type.toString(), lamp);
            System.out.println("Создана лампа типа " + type.toString());
        }
        return lamp;
    }

    private Lamp recognizeLamp(LampType type) {
        Lamp lamp;
        switch (type) {
            case LUSTRE:
                lamp = new Lustre();
                break;
            case SCONCE:
                lamp = new Sconce();
                break;
            case DESKTOP:
                lamp = new DesktopLamp();
                break;
            case STAND_LAMP:
                lamp = new StandLamp();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return lamp;
    }
}
