package exercise.connections;

// BEGIN
import exercise.TcpConnection;

public class Connected implements Connection {

    private TcpConnection connection;

    public Connected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        System.out.println("Error! Connection is already connected!");
    }

    @Override
    public void write(String str) {
        System.out.println(str);
    }

    @Override
    public void disconnect() {
        TcpConnection con = this.connection;
        con.setConnection(new Disconnected(con));
        System.out.println("disconnected");
    }
}
// END
