package andrey.patterns.behavioral.memento;

public class Caretaker {
    private Object object;

    public void save(WriteToFile writeToFile) {
        object = writeToFile.save();
    }

    public void undo(WriteToFile writeToFile) {
        writeToFile.undoToLastSave(object);
    }
}
