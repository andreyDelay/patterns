package andrey.patterns.creational.builder;

public class Computer {
    private String graphicsCard;
    private String processorModel;
    private String RAM;
    private int SSDsize;
    private ComputerType type;

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setSSDsize(int SSDsize) {
        this.SSDsize = SSDsize;
    }

    public void setType(ComputerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicsCard='" + graphicsCard + '\'' +
                ", processorModel='" + processorModel + '\'' +
                ", RAM='" + RAM + '\'' +
                ", SSDsize=" + SSDsize +
                ", type=" + type +
                '}';
    }
}
