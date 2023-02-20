package exercise;
//import java.util.List;
//import java.util.ArrayList;

// BEGIN
import exercise.connections.Disconnected;
import exercise.connections.Connection;
import exercise.connections.Connected;

public class TcpConnection implements Connection{

    private String str;
    private int num;
    private Connection connection;

    public TcpConnection(String str, int num) {
        this.str = str;
        this.num = num;
        this.connection = new Disconnected(this);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        this.connectionState.connect();
    }

    @Override
    public void disconnect() {
        this.connectionState.disconnect();

    }

    @Override
    public void write(String data) {
        this.connectionState.write(data);
    }

    @Override
    public String getCurrentState() {
        return this.connectionState.getCurrentState();
    }
}
// END
