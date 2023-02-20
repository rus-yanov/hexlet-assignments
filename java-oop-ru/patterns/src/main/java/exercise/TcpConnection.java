package exercise;
import java.util.List;
import java.util.ArrayList;

// BEGIN
import exercise.connections.Disconnected;
import exercise.connections.Connection;

public class TcpConnection {

    private String str;
    private int num;
    private Connection connection;

    public TcpConnection(String str, int num) {
        this.str = str;
        this.num = num;
        this.connection = new Disconnected(this);
    }

    public Connection getCurrentState() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
// END
