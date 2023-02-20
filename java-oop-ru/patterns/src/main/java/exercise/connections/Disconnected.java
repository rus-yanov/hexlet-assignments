package exercise.connections;

// BEGIN
import exercise.TcpConnection;

public class Disconnected implements Connection {

    private TcpConnection connection;

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        TcpConnection connection1 = this.connection;
        connection1.setConnection(new Connected(connection1));
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
