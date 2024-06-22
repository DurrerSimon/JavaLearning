package Concurrency;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(2000); // Simuliere eine lang andauernde Berechnung
            return 123;
        };

        Future<Integer> future = executor.submit(task);

        try {
            System.out.println("Ergebnis: " + future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();

        
        
    }
}
