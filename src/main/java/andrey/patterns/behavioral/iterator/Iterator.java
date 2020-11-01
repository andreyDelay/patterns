package andrey.patterns.behavioral.iterator;

public interface Iterator<T> {
    T first();

    T next();

    boolean hasNext();

    T getCurrent();

}
