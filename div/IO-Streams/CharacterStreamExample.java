import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hallo, dies ist ein Beispiel für Character-Streams.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader("output.txt")) {
            int character;
            StringBuilder result = new StringBuilder();
            while ((character = reader.read()) != -1) {
                result.append((char) character);
            }
            System.out.println("Gelesener Text: " + result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
