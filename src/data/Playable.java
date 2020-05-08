package data;

import javax.sound.sampled.LineUnavailableException;

public interface Playable {

    void play(int freq) throws LineUnavailableException;
}
