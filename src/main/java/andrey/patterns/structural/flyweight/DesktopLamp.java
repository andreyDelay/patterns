package andrey.patterns.structural.flyweight;

public class DesktopLamp implements Lamp {
    private final LampType type = LampType.DESKTOP;
    private String wattage = "50 ватт";

    @Override
    public void light() {
        System.out.println("Свет настольной лампы, мощностью " + wattage);
    }

    @Override
    public void setWattage(String wattage) {
        this.wattage = wattage + " ватт";
    }

    @Override
    public String getWattage() {
        return wattage;
    }
}
