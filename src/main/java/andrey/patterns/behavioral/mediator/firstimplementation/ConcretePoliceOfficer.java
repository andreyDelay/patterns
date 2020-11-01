package andrey.patterns.behavioral.mediator.firstimplementation;

public class ConcretePoliceOfficer implements PoliceOfficer {
    private Vehicle vehicle;
    private Road road;
    private boolean start, stop;
    
    @Override
    public void registerRoad(Road road) {
        this.road = road;
    }

    @Override
    public void registerVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;

    }

    @Override
    public boolean isStarted() {
        return start;
    }

    @Override
    public boolean isStopped() {
        return stop;
    }

    @Override
    public void setStartedStatus(boolean status) {
        start = status;
    }

    @Override
    public void setStoppedStatus(boolean status) {
        stop = status;
    }
}
