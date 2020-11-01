package andrey.patterns.behavioral.mediator.firstimplementation;

public class Vehicle implements Statement {
    private PoliceOfficer policeOfficer;

    public Vehicle(PoliceOfficer policeOfficer) {
        this.policeOfficer = policeOfficer;
    }

    @Override
    public void start() {
        if (policeOfficer.isStopped()) {
            System.out.println("Started...");
            policeOfficer.setStartedStatus(true);
        } else {
            System.out.println("Will wait to start....");
        }
    }

    @Override
    public void stop() {
        if (policeOfficer.isStopped()) {
            System.out.println("Stopped....");
            policeOfficer.setStoppedStatus(true);
        } else {
            System.out.println("Will wait to stop....");
        }
    }

    public void getReady() {
        System.out.println("Getting ready....");
    }
}
