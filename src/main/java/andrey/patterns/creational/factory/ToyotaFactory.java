package andrey.patterns.creational.factory;

public class ToyotaFactory implements CarFactory {

    @Override
    public Car makeOrder() {
        return new Toyota();
    }
}
