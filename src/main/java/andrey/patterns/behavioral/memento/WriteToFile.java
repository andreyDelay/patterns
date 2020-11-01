package andrey.patterns.behavioral.memento;

public class WriteToFile {
    private String pathToFile;
    private StringBuilder content;

    public WriteToFile(String pathToFile) {
        this.pathToFile = pathToFile;
        content = new StringBuilder();
    }

    public void write(String newData) {
        content.append(newData);
    }

    public Memento save() {
        return new Memento(pathToFile, content);
    }

    public void undoToLastSave(Object object) {
        Memento memento = (Memento) object;
        pathToFile = memento.getPathToFile();
        content = memento.getContent();
    }

    @Override
    public String toString() {
        return content.toString();
    }
}
