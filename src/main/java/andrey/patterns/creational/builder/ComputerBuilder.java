package andrey.patterns.creational.builder;

public abstract class ComputerBuilder {

    Computer computer;

    public void createComputer() {
        computer = new Computer();

    }

    public abstract void graphicsCard();

    public abstract void processorModel();

    public abstract void RAMSize();

    public abstract void SSDSize();

    public abstract void chooseComputerType();

    public Computer getComputer() {
        return computer;
    }

}
