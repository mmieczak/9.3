package data;

import java.util.Random;

public class AutoComposer implements Composeable {

    @Override
    public int[] compose() {
        int[] tempSounds = new int[5];
        for (int i = 0; i < 5; i++) {
            tempSounds[i] = generateRandomFromTreshold(100, 5000);
        }
        return tempSounds;
    }

    private int generateRandomFromTreshold(int min, int max) {
        Random random = new Random();
        return random.nextInt(max + 1 - min) + min;
    }
}
