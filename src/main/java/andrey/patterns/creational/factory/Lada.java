package andrey.patterns.creational.factory;

public class Lada implements Car {

    @Override
    public void orderCar() {
        System.out.println("Car of model \"Lada\" is ordered");
    }
}
