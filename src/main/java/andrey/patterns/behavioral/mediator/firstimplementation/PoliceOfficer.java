package andrey.patterns.behavioral.mediator.firstimplementation;

public interface PoliceOfficer {
    void registerRoad(Road road);

    void registerVehicle(Vehicle vehicle);

    boolean isStarted();

    boolean isStopped();

    void setStartedStatus(boolean status);

    void setStoppedStatus(boolean status);
}
