package andrey.patterns.structural.flyweight;

public class Sconce implements Lamp {
    private final LampType type = LampType.SCONCE;
    private String wattage = "30 ватт";

    @Override
    public void light() {
        System.out.println("Легкий свет настенного бра для чтения, мощностью " + wattage);
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
