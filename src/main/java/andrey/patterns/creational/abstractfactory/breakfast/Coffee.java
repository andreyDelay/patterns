package andrey.patterns.creational.abstractfactory.breakfast;

import andrey.patterns.creational.abstractfactory.Drink;

public class Coffee implements Drink {

    public void description() {
        System.out.println("A cup of black coffee");
    }
}
