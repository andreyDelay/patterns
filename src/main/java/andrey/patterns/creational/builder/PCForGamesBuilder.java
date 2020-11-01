package andrey.patterns.creational.builder;

public class PCForGamesBuilder extends ComputerBuilder{
    @Override
    public void graphicsCard() {
        computer.setGraphicsCard("nvidia geforce rtx 2070 super");
    }

    @Override
    public void processorModel() {
        computer.setProcessorModel("intel core i7 coffee lake");
    }

    @Override
    public void RAMSize() {
        computer.setRAM("32GB");
    }

    @Override
    public void SSDSize() {
        computer.setSSDsize(2000);
    }

    @Override
    public void chooseComputerType() {
        computer.setType(ComputerType.DESKTOP);
    }
}
