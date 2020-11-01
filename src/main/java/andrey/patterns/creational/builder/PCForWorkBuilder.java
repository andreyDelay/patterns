package andrey.patterns.creational.builder;

public class PCForWorkBuilder extends ComputerBuilder{
    @Override
    public void graphicsCard() {
        computer.setGraphicsCard("nvidia geforce rtx 2060");
    }

    @Override
    public void processorModel() {
        computer.setProcessorModel("intel core i5");
    }

    @Override
    public void RAMSize() {
        computer.setRAM("16GB");
    }

    @Override
    public void SSDSize() {
        computer.setSSDsize(512);
    }

    @Override
    public void chooseComputerType() {
        computer.setType(ComputerType.DESKTOP);
    }
}
