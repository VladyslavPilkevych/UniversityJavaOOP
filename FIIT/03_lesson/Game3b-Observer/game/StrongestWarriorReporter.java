package game;

public class StrongestWarriorReporter implements ClashFollower {
    Game game;

    public StrongestWarriorReporter(Game game) {
        this.game = game;
    }

    public void inform() {
        int maxKnightEnergy = Integer.MIN_VALUE;
        int maxOgreEnergy = Integer.MIN_VALUE;
        int maxKnightIndex = -1;
        int maxOgreIndex = -1;

        for (int i = 0; i < game.numberOfWarriors; ++i) {
            int knightEnergy = game.knights[i].getEnergy();
            int ogreEnergy = game.ogres[i].getEnergy();
            if (knightEnergy > maxKnightEnergy) {
                maxKnightEnergy = knightEnergy;
                maxKnightIndex = i;
            }
            if (ogreEnergy > maxOgreEnergy) {
                maxOgreEnergy = ogreEnergy;
                maxOgreIndex = i;
            }
        }

        System.out.println("*** Strongest Warrior Report ***");
        if (maxKnightEnergy > maxOgreEnergy)
            System.out.println("The strongest knight is at position " + (maxKnightIndex + 1) + " with energy " + maxKnightEnergy);
        else if (maxOgreEnergy > maxKnightEnergy)
            System.out.println("The strongest ogre is at position " + (maxOgreIndex + 1) + " with energy " + maxOgreEnergy);
        else
            System.out.println("Both strongest knight and ogre have the same energy: " + maxKnightEnergy);
    }
}
