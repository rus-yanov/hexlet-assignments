package exercise.connections;

// BEGIN
public class Disconnected implements Connection {

    private TcpConnection connection;

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        TcpConnection connection = this.connection;
        connection.setConnection(new Connected(connection));
        System.out.println("connected");
    }

    @Override
    public void write(String str) {
        System.out.println("Error! Connection is disconnected!");
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Connection is already disconnected!");
    }
}
// END
