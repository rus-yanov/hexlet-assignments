package exercise.connections;

// BEGIN
import exercise.TcpConnection;

public class Disconnected implements Connection {

    private TcpConnection connection;
    private String state = "disconnected";

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public String getCurrentState() {
        return state;
    }

    @Override
    public void connect() {
        TcpConnection con = this.connection;
        con.setConnection(new Connected(con));
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
