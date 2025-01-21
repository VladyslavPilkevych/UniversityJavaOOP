package game;

import characters.*;

import java.util.Random;

public class RandomizedGameSetup implements GameSetup {
    public void setup(Knight[] knights, Ogre[] ogres, int nKnights, int nBraveKnights, int nBadOgres) {
        int numberOfWarriors = nKnights + nBraveKnights;

        Random random = new Random();

        // Shuffle knights
        for (int i = 0; i < numberOfWarriors; ++i) {
            if (i < nKnights)
                knights[i] = new Knight(80, new Sword(i));
            else
                knights[i] = new BraveKnight(100, new Sword(i));
        }
        for (int i = 0; i < numberOfWarriors; ++i) {
            int index = random.nextInt(numberOfWarriors);
            Knight temp = knights[i];
            knights[i] = knights[index];
            knights[index] = temp;
        }

        // Shuffle ogres
        for (int i = 0; i < numberOfWarriors; ++i) {
            if (i < nBadOgres)
                ogres[i] = new BadOgre(100);
            else
                ogres[i] = new Ogre(100);
        }
        for (int i = 0; i < numberOfWarriors; ++i) {
            int index = random.nextInt(numberOfWarriors);
            Ogre temp = ogres[i];
            ogres[i] = ogres[index];
            ogres[index] = temp;
        }
    }
}
