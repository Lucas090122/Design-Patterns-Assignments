public class Main {
    public static void main(String[] args) {
        Game game1 = new CoinGame();
        game1.play(3); // Start a Coin Game with 3 players
        System.out.println();
        Game game2 = new DiceGame();
        game2.play(3); // Start a Dice Game with 3 players
    }
}
