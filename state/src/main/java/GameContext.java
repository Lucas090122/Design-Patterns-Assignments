public class GameContext {
    private String name;
    private int experiencePoints;
    private int healthPoints;
    private CharacterState state;

    public GameContext(String name) {
        this.name = name;
        this.experiencePoints = 0;
        this.healthPoints = 50;
        this.state = new NoviceState();
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void addExperience(int points) {
        experiencePoints += points;
        checkLevelUp();
    }

    public void addHealth(int points) {
        healthPoints += points;
    }

    public void reduceHealth(int points) {
        healthPoints -= points;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public void train() {
        state.train(this);
        System.out.println(name + " has " + experiencePoints + " experience points and " + healthPoints + " health points.");
    }

    public void medicate() {
        state.medicate(this);
        System.out.println(name + " has " + experiencePoints + " experience points and " + healthPoints + " health points.");
    }

    public void fight() {
        state.fight(this);
        System.out.println(name + " has " + experiencePoints + " experience points and " + healthPoints + " health points.");
    }

    private void checkLevelUp() {
        if (state instanceof ExpertState) {
            return;
        }
        if (experiencePoints >= 200) {
            System.out.println(name + " has advanced to Expert level!");
            setState(new ExpertState());
        } else if (experiencePoints >= 100 && !(state instanceof IntermediateState)) {
            System.out.println(name + " has advanced to Intermediate level!");
            setState(new IntermediateState());
        }
    }

    public Boolean isGameEnd() {
        if (experiencePoints >= 400) {
            System.out.println(name + " has reached the master level!");
            System.out.println("Congratulations! You have completed the game.");
            return true;
        }
        if (healthPoints <= 0) {
            System.out.println(name + " has lost all health points. Game over.");
            return true;
        }
        return false;
    }

}
