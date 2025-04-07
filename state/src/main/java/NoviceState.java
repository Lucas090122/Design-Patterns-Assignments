public class NoviceState implements CharacterState {
    @Override
    public void train(GameContext context) {
        System.out.println(context.getName() + " is training...");
        context.addExperience(10);
    }

    @Override
    public void medicate(GameContext context) {
        System.out.println(context.getName() + " is in novice level, cannot medicate.");
    }

    @Override
    public void fight(GameContext context) {
        System.out.println(context.getName() + " is in novice level, cannot fight.");
    }
}
