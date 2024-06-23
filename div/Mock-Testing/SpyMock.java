package Concurrency.Mock.*
    

import static org.mockito.Mockito.*;
import org.mockito.Mockito;

public class SpyMock {
    public static void main(String[] args) {
        // Erstellen eines echten Objekts
        MyClass myObject = new MyClass();

        // Spionieren des echten Objekts
        MyClass spiedObject = spy(myObject);

        // Definieren des Verhaltens für eine Methode des echten Objekts
        doReturn("Mocked Value").when(spiedObject).getValue();

        // Aufruf der echten Methode
        System.out.println("Real Value: " + myObject.getValue());

        // Aufruf der gesperrten Methode
        System.out.println("Mocked Value: " + spiedObject.getValue());
    }
}

class MyClass {
    public String getValue() {
        return "Real Value";
    }
}
