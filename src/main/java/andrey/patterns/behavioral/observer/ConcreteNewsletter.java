package andrey.patterns.behavioral.observer;

public class ConcreteNewsletter extends Newsletter {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifySubscribers();
    }
}
