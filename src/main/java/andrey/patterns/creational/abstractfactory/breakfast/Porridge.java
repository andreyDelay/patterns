package andrey.patterns.creational.abstractfactory.breakfast;

import andrey.patterns.creational.abstractfactory.MainDish;

public class Porridge implements MainDish {

    public void description() {
        System.out.println("A plate of porridge");
    }
}
