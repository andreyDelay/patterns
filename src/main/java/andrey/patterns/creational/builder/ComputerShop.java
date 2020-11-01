package andrey.patterns.creational.builder;

public class ComputerShop {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new NoteBookForWorkBuilder());
        Computer computer = director.getComputer();

        System.out.println(computer);
    }
}
