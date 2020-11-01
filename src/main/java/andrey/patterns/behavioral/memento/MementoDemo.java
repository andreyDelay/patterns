package andrey.patterns.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        WriteToFile writeToFile = new WriteToFile("myFile.txt");
        Caretaker caretaker = new Caretaker();

        writeToFile.write("The first information to be written in the file\n");
        System.out.println(writeToFile);
        caretaker.save(writeToFile);

        writeToFile.write("The second information to be written in the file\n");
        System.out.println(writeToFile);

        caretaker.undo(writeToFile);
        System.out.println("Загружаем старую версию файла и печатаем!");
        System.out.println("=======================================");
        System.out.println(writeToFile);
    }
}
