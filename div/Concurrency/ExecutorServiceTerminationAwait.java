package Concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTerminationAwait {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Einreichen einiger Tasks
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                System.out.println("Ausführen von Task " + finalI);
                try {
                    Thread.sleep(1000);  // Simuliere eine Aufgabe, die Zeit benötigt
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shutdown des ExecutorService initiieren
        executor.shutdown();

        try {
            // Warten auf die Beendigung aller Tasks oder Timeout nach 10 Sekunden
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Nicht alle Aufgaben wurden rechtzeitig beendet.");
            }
        } catch (InterruptedException e) {
            System.out.println("Warten wurde unterbrochen.");
        }

        System.out.println("Alle Aufgaben abgeschlossen oder Timeout erreicht.");
    }
}
