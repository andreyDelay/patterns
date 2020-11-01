package andrey.patterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        System.out.println(connection.toString());

        Connection connection1 = Connection.getInstance();
        System.out.println(connection1.toString());

        connection.checkConnection();
    }
}
