package andrey.patterns.creational.builder;

public class NoteBookForWorkBuilder extends ComputerBuilder{
    @Override
    public void graphicsCard() {
        computer.setGraphicsCard("nvidia geforce gtx 650");
    }

    @Override
    public void processorModel() {
        computer.setProcessorModel("intel core i3");
    }

    @Override
    public void RAMSize() {
        computer.setRAM("8GB");
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
