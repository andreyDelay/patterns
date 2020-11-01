package andrey.patterns.behavioral.templatemethod;

public class Facade {
    Worker worker;

    public Facade(Worker worker) {
        this.worker = worker;
    }

    public void dailyRoutineForWorker() {
        worker.getUp();
        worker.eatBreakfast();
        worker.goToWork();
        worker.work();
        worker.returnHome();
        worker.sleep();
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
}
