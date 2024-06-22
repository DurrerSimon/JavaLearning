import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        String text = "Hallo, dies ist ein Beispiel für Byte-Streams.";
        
        try {
            // Byte-Stream zum Schreiben initialisieren
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            
            // Text in den Byte-Stream schreiben
            outputStream.write(text.getBytes());
            
            // Byte-Stream in ein Byte-Array umwandeln
            byte[] byteArray = outputStream.toByteArray();
            
            // Byte-Array in einen neuen Byte-Stream lesen
            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);
            
            // Text aus dem Byte-Stream lesen und ausgeben
            byte[] buffer = new byte[1024];
            int length;
            StringBuilder result = new StringBuilder();
            while ((length = inputStream.read(buffer)) != -1) {
                result.append(new String(buffer, 0, length));
            }
            
            System.out.println("Gelesener Text: " + result.toString());
            
            // Streams schließen
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
