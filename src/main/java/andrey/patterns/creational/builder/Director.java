package andrey.patterns.creational.builder;

public class Director {
    ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer getComputer() {
        builder.createComputer();

        builder.graphicsCard();
        builder.processorModel();
        builder.RAMSize();
        builder.SSDSize();
        builder.chooseComputerType();

        Computer computer = builder.getComputer();

        return computer;
    }
}
