import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to the farm game!");
    }

    public void printCommands() {
        System.out.println("Commands:");
        System.out.println("buy - buy a new field");
        System.out.println("quit - quit the game");
    }

    public void printPlayerInfo(String playerName, int money) {
        System.out.println("Player: " + playerName);
        System.out.println("Money: " + money);
    }
}
