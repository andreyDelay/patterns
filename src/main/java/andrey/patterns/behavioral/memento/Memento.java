package andrey.patterns.behavioral.memento;

public class Memento {
    private String pathToFile;
    private StringBuilder content;

    public Memento(String pathToFile, StringBuilder content) {
        this.pathToFile = pathToFile;
        this.content = new StringBuilder(content);
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public StringBuilder getContent() {
        return content;
    }
}
