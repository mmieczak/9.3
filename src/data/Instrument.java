package data;

import utils.SoundsUtil;

import javax.sound.sampled.LineUnavailableException;

public abstract class Instrument implements Playable {

    @Override
    public void play(int freq) throws LineUnavailableException {
        SoundsUtil soundsUtil = new SoundsUtil();
        soundsUtil.tone(freq, 100);
    }
}
