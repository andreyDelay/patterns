package andrey.patterns.behavioral.mediator.firstimplementation;

public class Road implements Statement {
    private PoliceOfficer policeOfficer;

    public Road(PoliceOfficer policeOfficer) {
        this.policeOfficer = policeOfficer;
        policeOfficer.setStoppedStatus(true);
    }

    @Override
    public void start() {
        System.out.println("Starting permission granted...");
        policeOfficer.setStartedStatus(true);
    }

    @Override
    public void stop() {
        System.out.println("Stopping permission granted...");
        policeOfficer.setStoppedStatus(true);
    }
}
