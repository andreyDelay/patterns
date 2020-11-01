package andrey.patterns.creational.singleton;

public class Connection {

    private static volatile Connection instance = null;

    private Connection() {}

    public static Connection getInstance() {
        if (instance == null) {
            synchronized (Connection.class) {
                instance = new Connection();
            }
        }
        return instance;
    }

    public void checkConnection() {
        if (instance != null) {
            System.out.println("You connection is ready to use!");
        } else {
            System.out.println("Sorry, there is some problems with your connection...");
        }
    }

}
