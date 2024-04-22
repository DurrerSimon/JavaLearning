import javax.naming.ldap.Control;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Controller {
        Path sourcePath = Paths.get("input.txt"); // Pfad der Quelldatei
        Path targetPath = Paths.get("numbered_output.txt"); // Pfad der Zieldatei

        try {
            // Lese alle Zeilen aus der Quelldatei
            List<String> lines = Files.readAllLines(sourcePath, StandardCharsets.UTF_8);

            // Schreibe die Zeilen in die Zieldatei
            Files.write(targetPath, lines, StandardCharsets.UTF_8);

            System.out.println("Datei erfolgreich kopiert!");
        } catch (IOException e) {
            System.err.println("Ein Fehler ist aufgetreten: " + e.getMessage());
        }
    }