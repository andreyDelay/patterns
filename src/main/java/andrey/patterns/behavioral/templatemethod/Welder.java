package andrey.patterns.behavioral.templatemethod;

public class Welder extends Worker{
    @Override
    public void work() {
        System.out.println("Worker is welding weld joint");
    }
}
