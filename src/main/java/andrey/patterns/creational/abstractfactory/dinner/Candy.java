package andrey.patterns.creational.abstractfactory.dinner;

import andrey.patterns.creational.abstractfactory.Dessert;

public class Candy implements Dessert {
    @Override
    public void description() {
        System.out.println("One sweet candy");
    }
}
