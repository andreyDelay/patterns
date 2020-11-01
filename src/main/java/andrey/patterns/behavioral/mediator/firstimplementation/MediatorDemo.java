package andrey.patterns.behavioral.mediator.firstimplementation;

public class MediatorDemo {
    public static void main(String[] args) {
        PoliceOfficer policeOfficer = new ConcretePoliceOfficer();
        Vehicle vehicle = new Vehicle(policeOfficer);
        Road road = new Road(policeOfficer);
        policeOfficer.registerVehicle(vehicle);
        policeOfficer.registerRoad(road);

        vehicle.getReady();
        road.start();
        vehicle.start();
        vehicle.stop();
    }
}
