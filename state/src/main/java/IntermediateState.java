public class IntermediateState implements CharacterState {
    @Override
    public void train(GameContext context) {
        System.out.println(context.getName() + " is training...");
        context.addExperience(10);
    }

    @Override
    public void medicate(GameContext context) {
        System.out.println(context.getName() + " is medicating...");
        context.addExperience(5);
        context.addHealth(10);
    }

    @Override
    public void fight(GameContext context) {
        System.out.println(context.getName() + " is in intermediate level, cannot fight.");
    }
}
