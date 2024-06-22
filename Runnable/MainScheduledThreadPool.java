import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainScheduledThreadPool {

    public static void main (String[] args) {

        // Create a new fixed thread pool with the number of available processors
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

        // Schedule a task to run after 10000 milliseconds
        // service.schedule(new Task(), 10000, TimeUnit.MILLISECONDS);

        // Schedule a task to run at fixed rate of 1000 milliseconds 
        // service.scheduleAtFixedRate(new Task(), 10000, 1000, TimeUnit.MILLISECONDS);

        // Schedule a task to run with fixed delay of 1000 milliseconds
        service.scheduleWithFixedDelay(new Task(), 10000, 1000, TimeUnit.MILLISECONDS);

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
