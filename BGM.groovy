import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import java.io.File

def playBackgroundMusic(String musicFile) {
    try {
        File soundFile = new File(musicFile)
        Clip clip = AudioSystem.getClip()
        clip.open(AudioSystem.getAudioInputStream(soundFile))
        clip.start()
        clip.loop(Clip.LOOP_CONTINUOUSLY)  // Loop the background music
        
        // Keep the script running to play music in the background
        while (true) {
            Thread.sleep(1000)  // Sleep to keep the script running
        }
    } catch (Exception e) {
        e.printStackTrace()
    }
}

def musicFile = "BGM.mp3"
playBackgroundMusic(musicFile)