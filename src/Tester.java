import data.AutoComposer;
import data.Synthesizer;

import javax.sound.sampled.LineUnavailableException;

public class Tester {

    public static void main(String[] args) throws LineUnavailableException {

        AutoComposer autoComposer = new AutoComposer();
        int[] musicToPlay;
        musicToPlay = autoComposer.compose();

        Synthesizer synthesizer = new Synthesizer("S1");

        for (int i = 0; i < musicToPlay.length; i++) {
            synthesizer.play(musicToPlay[i]);
        }

    }
}
