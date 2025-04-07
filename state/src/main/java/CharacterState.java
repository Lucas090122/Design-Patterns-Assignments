public interface CharacterState {
    void train(GameContext context);
    void medicate(GameContext context);
    void fight(GameContext context);
}
