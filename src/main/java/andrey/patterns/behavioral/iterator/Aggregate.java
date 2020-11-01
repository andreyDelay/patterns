package andrey.patterns.behavioral.iterator;

public interface Aggregate<T> {
    Iterator<T> getIterator();
}
