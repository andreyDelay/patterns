package andrey.patterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
