public class SecurityInnerClasses {
    private String secret = "Geheim";

    // Innere Klasse, die nur innerhalb von SecurityInnerClasses zugänglich ist
    private class KeyManager {
        public void displaySecret() {
            System.out.println(secret);
        }
    }

    public void performSecureOperation() {
        KeyManager keyManager = new KeyManager();
        keyManager.displaySecret();  // Zugriff auf die Methode der inneren Klasse
    }
}
