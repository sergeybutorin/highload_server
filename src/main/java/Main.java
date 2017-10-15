/**
 * Created by sergeybutorin on 13/10/2017.
 */
public class Main {
    public static void main(String[] args) {
         final int PORT = 80;
         final int THREADS = Runtime.getRuntime().availableProcessors();
         final Server server = new Server(PORT, THREADS);
         server.start();
    }
}
