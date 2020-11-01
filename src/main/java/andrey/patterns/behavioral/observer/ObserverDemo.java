package andrey.patterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        ConcreteNewsletter subject = new ConcreteNewsletter();
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.setState(12);
    }
}
