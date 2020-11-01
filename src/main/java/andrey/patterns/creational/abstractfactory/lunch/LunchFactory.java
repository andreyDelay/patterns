package andrey.patterns.creational.abstractfactory.lunch;

import andrey.patterns.creational.abstractfactory.Dessert;
import andrey.patterns.creational.abstractfactory.Drink;
import andrey.patterns.creational.abstractfactory.FoodFactory;
import andrey.patterns.creational.abstractfactory.MainDish;

public class LunchFactory implements FoodFactory {
    @Override
    public Drink getDrink() {
        return new Lemonade();
    }

    @Override
    public MainDish getDish() {
        return new Pasta();
    }

    @Override
    public Dessert getDessert() {
        return new Cake();
    }
}
