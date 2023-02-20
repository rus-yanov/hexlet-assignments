package exercise;
//import java.util.List;
//import java.util.ArrayList;

// BEGIN
import exercise.connections.Disconnected;
import exercise.connections.Connection;

public class TcpConnection implements Connection {

    private String ip;
    private int num;
    private Connection connection;

    public TcpConnection(String ip, int num) {
        this.ip = ip;
        this.num = num;
        this.connection = new Disconnected(this);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Connection getCurrentState() {
        return this.connection;
    }

    @Override
    public void connect() {
        this.connection.connect();
    }

    @Override
    public void disconnect() {
        this.connection.disconnect();

    }

    @Override
    public void write(String str) {
        this.connection.write(str);
    }
}
// END
