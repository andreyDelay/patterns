package andrey.patterns.behavioral.templatemethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Facade facade = new Facade(new Welder());
        facade.dailyRoutineForWorker();

        facade.setWorker(new Programmer());
        facade.dailyRoutineForWorker();
    }
}
