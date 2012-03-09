import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;

// class
public class BackgroundPlayer {
	private Clip clip;
	private String bgfilename;

	//constructor
	public BackgroundPlayer(String bgfilename) { 
		this.bgfilename = bgfilename;
	}
	//methods
	public boolean start() {
		// Start playing.
		try {
			clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new FileInputStream(bgfilename));
	        clip.open(inputStream);
	        clip.loop(Clip.LOOP_CONTINUOUSLY);
	        System.err.println(bgfilename);
		} catch (LineUnavailableException e) {
			return false;
		} catch (FileNotFoundException e) {
			return false;
		} catch (UnsupportedAudioFileException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
        
		return true;
	}
	
	public boolean stop() {
		// Stop playing
		if (clip != null) {
			clip.stop();
		} else {
			System.err.println("You should call start() first!");
			return false;
		}
		return true;
	}
	
//	public boolean playOnce (String filename) {
//		Clip oneOff = filename;
//		clip.start ();
//		return false;
//	}
	
	
	
	// STATIC - NOT PART OF CLASS.
//	public static void music () {
//		try {
//		Clip clip = AudioSystem.getClip();
 //       AudioInputStream inputStream = AudioSystem.getAudioInputStream(new FileInputStream("85046_newgrounds_parago.wav"));
  //      clip.open(inputStream);
   //     clip.loop(Clip.LOOP_CONTINUOUSLY);
	//	} catch (IOException e) {
		//	e.printStackTrace();
	//	} catch (LineUnavailableException e) {
		//	e.printStackTrace();
	//	} catch (UnsupportedAudioFileException e) {
		//	e.printStackTrace();
	//	}
//	}

	
	// TESTING.
	public static void main(String[] args) {
		final BackgroundPlayer player = new BackgroundPlayer("music/Game_Music.wav");

		JFrame frame = new JFrame();
		frame.setSize(200,200);
		JButton button = new JButton("Click me to play");
		frame.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean success = player.start();
				System.err.println(success);
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}