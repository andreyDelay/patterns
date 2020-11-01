package andrey.patterns.creational.factory;

public class MercedesFactory implements CarFactory {

    @Override
    public Car makeOrder() {
        return new Mercedes();
    }
}
