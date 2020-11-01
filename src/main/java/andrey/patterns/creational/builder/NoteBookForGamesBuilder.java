package andrey.patterns.creational.builder;

public class NoteBookForGamesBuilder extends ComputerBuilder{
    @Override
    public void graphicsCard() {
        computer.setGraphicsCard("nvidia geforce gtx 1050");
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
        computer.setType(ComputerType.NOTEBOOK);
    }
}
