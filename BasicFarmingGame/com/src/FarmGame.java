public class FarmGame {
    private UserInterface userInterface;
    private FarmField farmField;
    private String playerName;
    private int money;

    public FarmGame() {
        this.userInterface = new UserInterface();
        this.farmField = new FarmField();
        this.playerName = "Farmer";
        this.money = 100;
    }
    public static void main(String[] args) {
        FarmGame game = new FarmGame();
        FarmGame.run();
    }

    public void run() {
        userInterface.printWelcomeMessage();
        userInterface.printCommands();
        while (true) {
            userInterface.printField(farmField.getFieldSize());
            userInterface.printPlayerInfo(playerName, money);
            String command = userInterface.getCommand();
            if (command.equals("quit")) {
                break;
            }
            if (command.equals("buy")) {
                money -= 10;
                farmField.setFieldSize(farmField.getFieldSize() + 1);
            }
        }
    }
}
