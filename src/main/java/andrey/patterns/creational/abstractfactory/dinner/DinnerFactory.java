package andrey.patterns.creational.abstractfactory.dinner;

import andrey.patterns.creational.abstractfactory.Dessert;
import andrey.patterns.creational.abstractfactory.Drink;
import andrey.patterns.creational.abstractfactory.FoodFactory;
import andrey.patterns.creational.abstractfactory.MainDish;

public class DinnerFactory implements FoodFactory {
    @Override
    public Drink getDrink() {
        return new Tea();
    }

    @Override
    public MainDish getDish() {
        return new Vegetables();
    }

    @Override
    public Dessert getDessert() {
        return new Candy();
    }
}
