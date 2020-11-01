package andrey.patterns.behavioral.iterator;

public class ConcreteAggregate<T> implements Aggregate {

    private Iterator<T> iterator;
    private Object[] array;
    private int index = 0;

    public ConcreteAggregate(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new RuntimeException("Некорректный размер коллекции");
        } else {
            array = new Object[initialCapacity];
        }
    }

    public void add(T elem) {
        array[index++] = elem;
    }

    @Override
    public Iterator<T> getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator<T> {
        int index = 0;

        @Override
        public T first() {
            return (T) array[0];
        }

        @Override
        public T next() {
            return (T)array[index++];
        }

        @Override
        public boolean hasNext() {
            if (index < array.length && array[index] != null) {
                return true;
            }
            return false;
        }

        @Override
        public T getCurrent() {
            return (T)array[index];
        }
    }
}
