package Concurrency;
interface Greeting {
    void greet();
}

public class AnonymousClass {
    public static void main(String[] args) {
        // Erstellung einer anonymen Klasse, die das Greeting-Interface implementiert
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hallo Welt!");
            }
        };

        greeting.greet();  // Ruft die Methode greet der anonymen Klasse auf
    }
}
