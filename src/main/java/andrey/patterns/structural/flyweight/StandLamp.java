package andrey.patterns.structural.flyweight;

public class StandLamp implements Lamp {
    private final LampType type = LampType.STAND_LAMP;
    private String wattage = "100 ватт";

    @Override
    public void light() {
        System.out.println("Приглушенный свет торшера, мощностью " + wattage);
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
