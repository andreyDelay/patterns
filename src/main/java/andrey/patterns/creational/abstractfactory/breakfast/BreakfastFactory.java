package andrey.patterns.creational.abstractfactory.breakfast;

import andrey.patterns.creational.abstractfactory.Dessert;
import andrey.patterns.creational.abstractfactory.Drink;
import andrey.patterns.creational.abstractfactory.FoodFactory;
import andrey.patterns.creational.abstractfactory.MainDish;

public class BreakfastFactory implements FoodFactory {

    @Override
    public Drink getDrink() {
        return new Coffee();
    }

    @Override
    public MainDish getDish() {
        return new Porridge();
    }

    @Override
    public Dessert getDessert() {
        return new Donut();
    }
}
