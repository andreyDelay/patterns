package andrey.patterns.creational.factory;

public class Toyota implements Car {

    @Override
    public void orderCar() {
        System.out.println("Car of model \"Toyota\" is ordered");
    }
}
