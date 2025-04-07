import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private GameContext gameContext;

    public Game() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();

        GameContext gameContext = new GameContext(name);

        System.out.println("Welcome, " + name + "! You are currently at Novice level.");

        while (!gameContext.isGameEnd()) {
            System.out.println("\nChoose an action: ");
            System.out.println("1. Train");
            System.out.println("2. Medicate");
            System.out.println("3. Fight");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> gameContext.train();
                case 2 -> gameContext.medicate();
                case 3 -> gameContext.fight();
                case 4 -> {
                    System.out.println("Exiting the game. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
