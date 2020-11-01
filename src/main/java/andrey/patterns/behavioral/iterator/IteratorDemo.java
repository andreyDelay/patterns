package andrey.patterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ConcreteAggregate<Integer> concreteAggregate = new ConcreteAggregate<>(12);
        concreteAggregate.add(1);
        concreteAggregate.add(2);
        concreteAggregate.add(3);
        concreteAggregate.add(4);
        concreteAggregate.add(5);
        Iterator<Integer> iterator = concreteAggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
