package andrey.patterns.behavioral.templatemethod;

public class Programmer extends Worker{
    @Override
    public void work() {
        System.out.println("Worker writes Java code");
    }
}
