public class DiceGame extends Game {
    private int[] scores;
    private int numberOfPlayers;
    private final int WINNING_SCORE = 20;
    private int winner = -1;

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        scores = new int[numberOfPlayers];
        System.out.println("Dice Game initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public void playSingleTurn(int player) {
        int roll = (int)(Math.random() * 6) + 1;
        scores[player] += roll;
        System.out.println("Player " + player + " rolled a " + roll + ". Total score: " + scores[player]);
        if (scores[player] >= WINNING_SCORE) {
            winner = player;
        }
    }

    @Override
    public boolean endOfGame() {
        return winner != -1;
    }

    @Override
    public void displayWinner() {
        System.out.println("Player " + winner + " wins!");
    }
}
