import java.io.IOException;

public class SystemStreamsExample {
    public static void main(String[] args) {
        try {
            // System.in InputStream
            System.out.println("Geben Sie eine Zeichenfolge ein:");
            int data = System.in.read();
            System.out.println("Eingegebene Zeichenfolge: " + (char) data);

            // System.out PrintStream
            System.out.println("Dies ist eine Ausgabe auf der Konsole.");

            // System.err PrintStream
            System.err.println("Dies ist eine Fehlermeldung auf der Konsole.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}