package andrey.patterns.behavioral.templatemethod;

public abstract class Worker {

    public void getUp() {
        System.out.println("Get up at 6 O'Clock");
    }

    public void eatBreakfast() {
        System.out.println("Worker is eating his breakfast!");
    }

    public void goToWork() {
        System.out.println("Worker is on the way to the place where his work is");
    }

    public void returnHome() {
        System.out.println("Worker is having relax after hard day...");
    }

    public void sleep() {
        System.out.println("It's time ti sleep for worker");
    }


    public abstract void work();
}
