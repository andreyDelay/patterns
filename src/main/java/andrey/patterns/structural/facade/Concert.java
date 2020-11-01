package andrey.patterns.structural.facade;

public interface Concert {
    void entrance();

    void mainEvent();

    void conclusion();

    void stageCurtain();

    default void start() {
        System.out.println("Concert is staring");
    }
}
