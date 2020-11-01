package andrey.patterns.structural.flyweight;

public class Lustre implements Lamp {
    private final LampType type = LampType.LUSTRE;
    private String wattage = "100 ватт";

    @Override
    public void light() {
        System.out.println("Люстра светит на всю комнату, мощностью " + wattage);
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
