package andrey.patterns.structural.facade;

public class StageCurtain {
    private boolean curtainStatus;

    public StageCurtain() {
        curtainStatus = false;
    }

    public boolean curtainIsOpened() {
        return curtainStatus;
    }

    public void openCurtain() {
        curtainStatus = true;
        System.out.println("Открыт занавес!");
    }

    public void closeCurtain() {
        curtainStatus = false;
        System.out.println("Закрыт занавес!");
    }
}
