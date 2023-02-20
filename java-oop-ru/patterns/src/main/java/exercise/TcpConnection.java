package exercise;
import java.util.List;
import java.util.ArrayList;

// BEGIN
import exercise.connections.Disconnected;
import exercise.connections.Connection;

public class TcpConnection {

    private Connection connection;

    public TcpConnection() {
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
