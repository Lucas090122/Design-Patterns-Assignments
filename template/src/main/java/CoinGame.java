public class CoinGame extends Game {
    private int[] scores;
    private int numberOfPlayers;
    private final int WINNING_SCORE = 5;
    private int winner = -1;

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        scores = new int[numberOfPlayers];
        System.out.println("Coin Game initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public void playSingleTurn(int player) {
        int flip = (int)(Math.random() * 2); // 0 for heads, 1 for tails
        if (flip == 0) {
            scores[player]++;
            System.out.println("Player " + player + " flipped heads. Total score: " + scores[player]);
        } else {
            System.out.println("Player " + player + " flipped tails. No score change.");
        }
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
