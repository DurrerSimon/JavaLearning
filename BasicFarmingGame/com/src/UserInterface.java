import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to the farm game!");
    }

}
