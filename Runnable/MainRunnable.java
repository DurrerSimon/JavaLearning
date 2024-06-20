public class MainRunnable {
    public static void main (String[] args) {
        Thread thread1 = new Thread (new Task());
        Thread thread2 = new Thread (new Task());
        thread1.start();
        thread2.start();
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

public static class Task implements Runnable {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}