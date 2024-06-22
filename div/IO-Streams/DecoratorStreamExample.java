import java.io.*;

public class DecoratorStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt");
            // DataOutputStream wird als Decorator fr FileOutputStream verwendet
             DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(fos))) {
            dos.writeInt(123); // Schreibe einen Integer mit DataOutputStream
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("output.txt");
            // DataInputStream wird als Decorator fr FileInputStream verwendet
             DataInputStream dis = new DataInputStream(new BufferedInputStream(fis))) {
            int num = dis.readInt(); // Lese den zuvor geschriebenen Integer
            System.out.println("Gelesene Zahl: " + num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
