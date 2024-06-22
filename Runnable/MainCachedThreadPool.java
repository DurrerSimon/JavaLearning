import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainCachedThreadPool {

    public static void main (String[] args) {

        // Create a new fixed thread pool with the number of available processors
        ExecutorService service = Executors.newCachedThreadPool();

        for( int i = 0; i < 100; i++) {
            service.execute(new Task());
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        service.shutdown();
    }

    public static class Task implements Runnable {
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
