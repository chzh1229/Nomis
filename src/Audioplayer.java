import java.io.*;

import javax.lang.model.element.NestingKind;
import javax.sound.sampled.*;
import javax.swing.*;
   
// To play sound using Clip, the process need to be alive.
// Hence, we use a Swing application.
public class Audioplayer extends JFrame {

// Constructor
   public Audioplayer() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Music Background");
      this.setSize(300, 200);
      this.setVisible(true);
   
      // TODO Use relative path when refering to resources, as this project needs to be able to be implemented on any machine
      
      try {
         // Open an audio input stream.
    	  //File soundFile = new File("C:/Users/Victor Ng/workspace/Inf-1 OOP project/Music/85046_newgrounds_parago.wav");
    	  File soundFile = new File("music/scifi002.wav");
    	  
    	  AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         //clip.open(audioIn);
         //clip.start();
         //clip.loop(Clip.LOOP_CONTINUOUSLY);  // repeat forever
         
         SoundEffect newSound = SoundEffect.BUTTON1;
         newSound.play();
         
         
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }
   
   public static void main(String[] args) {
      Audioplayer a = new Audioplayer ();
      

   }
}