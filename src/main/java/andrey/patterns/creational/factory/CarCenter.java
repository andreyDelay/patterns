package andrey.patterns.creational.factory;

public class CarCenter {
    public static void main(String[] args) {
        CarFactory carFactory = chooseCarByLogo("lada");
        Car car = carFactory.makeOrder();
        car.orderCar();
    }

    private static CarFactory chooseCarByLogo(String logo) {
        if (logo.equalsIgnoreCase("lada")) {
            return new LadaFactory();
        } else if (logo.equalsIgnoreCase("toyota")) {
            return new ToyotaFactory();
        } else if (logo.equalsIgnoreCase("mercedes")) {
            return new MercedesFactory();
        } else {
            throw new RuntimeException("Order car of model " + logo + " is unavailable");
        }
    }
}
