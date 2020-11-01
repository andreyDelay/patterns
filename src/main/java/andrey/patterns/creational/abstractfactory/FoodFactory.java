package andrey.patterns.creational.abstractfactory;

public interface FoodFactory {
    Drink getDrink();
    MainDish getDish();
    Dessert getDessert();
}
