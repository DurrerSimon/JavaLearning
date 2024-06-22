import java.io.*;

public class TryWithRessourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            // Solange es Zeilen zum Lesen gibt
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Ausgabe der gelesenen Zeile
            }
        } catch (IOException e) {
            e.printStackTrace(); // Fehlerbehandlung, falls eine IOException auftritt
        }
    }
}
