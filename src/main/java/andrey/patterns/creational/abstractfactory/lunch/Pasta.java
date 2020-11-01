package andrey.patterns.creational.abstractfactory.lunch;

import andrey.patterns.creational.abstractfactory.MainDish;

public class Pasta implements MainDish {
    @Override
    public void description() {
        System.out.println("A portion of delicious italian pasta");
    }
}
