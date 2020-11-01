package andrey.patterns.creational.abstractfactory.dinner;

import andrey.patterns.creational.abstractfactory.MainDish;

public class Vegetables implements MainDish {
    @Override
    public void description() {
        System.out.println("A portion of healthy vegetables");
    }
}
