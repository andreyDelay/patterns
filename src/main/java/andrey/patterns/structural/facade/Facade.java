package andrey.patterns.structural.facade;

public class Facade {
    private StageCurtain stageCurtain = new StageCurtain();
    private Concert concert = new ClownsConcert();

    public void startConcert() {
        stageCurtain.openCurtain();
        concert.start();
        concert.entrance();
        concert.mainEvent();
        concert.conclusion();
        concert.stageCurtain();
        stageCurtain.closeCurtain();
    }
}
