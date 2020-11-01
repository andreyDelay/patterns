package andrey.patterns.behavioral.observer;

public class ConcreteObserver implements Observer{
    private int state;
    private ConcreteNewsletter object;

    public ConcreteObserver(ConcreteNewsletter concreteObject) {
        object = concreteObject;
    }

    @Override
    public void update() {
        state = object.getState();
        System.out.println("Обновилась информация " + state);
    }

    public int getState() {
        return state;
    }
}
