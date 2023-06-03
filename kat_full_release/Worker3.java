import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;

public class Worker3 {

    final static String SERVER_ADDRESS = "localhost";
    final static int PORT = 202;

    public static void main(String[] args) throws UnknownHostException, IOException {

        Socket socket = new Socket(SERVER_ADDRESS, PORT);

        System.out.println("Worker: 3 has started");

        WorkerHandiler wb = new WorkerHandiler(socket);
        wb.start();
    }

}