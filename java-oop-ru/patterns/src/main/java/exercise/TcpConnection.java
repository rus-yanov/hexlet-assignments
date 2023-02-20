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

    @Override
    public String getCurrentState() {
        return connection.getCurrentState();
    }

    @Override
    public void connect() {
        connection.connect();
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void write(String str) {
        connection.write(str);
    }
}
// END
