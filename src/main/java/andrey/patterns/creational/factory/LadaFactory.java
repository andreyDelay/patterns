package andrey.patterns.creational.factory;

public class LadaFactory implements CarFactory {

    @Override
    public Car makeOrder() {
        return new Lada();
    }
}
