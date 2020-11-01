package andrey.patterns.creational.factory;

public class Mercedes implements Car {

    @Override
    public void orderCar() {
        System.out.println("Car of model \"Mercedes\" is ordered");
    }
}
