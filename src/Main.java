import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.Timer;

/**
 * The main class for your arcade game.
 * 
 * You can design your game any way you like, but make the game start
 * by running main here.
 * 
 * Also don't forget to write javadocs for your classes and functions!
 * 
 * @author Buffalo
 *
 */
public class Main {
	
	private ScoreKeeper scorer;
	private Level lev;
	private Hero player;
	private static int UPDATE_INTERVAL_MS = 10;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Arcade game starting!!!!!");
		new Main();
	
	}
	
	public Main() {
		scorer = new ScoreKeeper();
		lev = new Level(null);
		player = new Hero();
		scanFiles();
		
		Timer advanceStateTimer = new Timer(UPDATE_INTERVAL_MS, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timeShift();
			}
		});
		advanceStateTimer.start();
	}
	
	public void scanFiles() {
		
		FileReader file = null;
		try {
			file = new FileReader("scores.txt"); //throws FileNotFoundException
		} catch (IOException e) {
		    try {
				Files.write(Paths.get("scores.txt"), "".getBytes());
				file = new FileReader("scores.txt");
			} catch (IOException e1) {
				System.err.println("Error with making scores file. Please scream for assistance.");
			} 
		}finally {
			scorer.readScoreFile(file);
			System.out.println("Done Making File");
		}
		
		file = null;
		String fileName = "Level" + 1 + ".txt";
		try {
			file = new FileReader(fileName);
		} catch (IOException e) {
		    System.err.println(fileName + " does not exist."); 
		}
		
		
	}
	
	public void handleCommands() {
		
	}
	
	public void loadStartScreen() {
		
	}
	
	public void handleLevelChange() {
		
	}
	
	public void handlePlayerMovement() {
		
	}
	
	public void timeShift() {
		player.timeShift();
		
	}

}
