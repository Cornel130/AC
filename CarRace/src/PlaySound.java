import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


public class PlaySound {

    private Clip clip;

    public void playSound() {
        try {
            System.out.println("Playing sound...");
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(".\\shanghai-formula-1-grand-prix.wav")));
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopSound(){
        if(clip!=null)
            clip.stop();
    }

    public static void main(String[] args) throws InterruptedException {
        PlaySound ps = new PlaySound();
        ps.playSound();
        Thread.sleep(15000);
        ps.stopSound();
    }
}
