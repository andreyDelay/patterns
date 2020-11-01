package andrey.patterns.creational.abstractfactory;

import andrey.patterns.creational.abstractfactory.breakfast.BreakfastFactory;
import andrey.patterns.creational.abstractfactory.lunch.LunchFactory;

public class DiningRoom {
    public static void main(String[] args) {
        FoodFactory foodFactory = new BreakfastFactory();

        Drink drink = foodFactory.getDrink();
        MainDish dish = foodFactory.getDish();
        Dessert dessert = foodFactory.getDessert();

        System.out.println("Your food set for now contains from:");
        System.out.println("=========================");
        dish.description();
        drink.description();
        dessert.description();
        System.out.println("=========================");
    }
}
