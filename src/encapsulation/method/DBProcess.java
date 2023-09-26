package encapsulation.method;

public class DBProcess implements InterProcess{
    private void connect() {}
    private void query() {}
    private void disconnect() {}

    @Override
    public void work() {
        connect();
        query();
        disconnect();
    }
}
