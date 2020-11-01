package andrey.patterns.behavioral.templatemethod;

public class Manager extends Worker{
    @Override
    public void work() {
        System.out.println("Worker takes a part in a meeting, and manage a project");
    }
}
