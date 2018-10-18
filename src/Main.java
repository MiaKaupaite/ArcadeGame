import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

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
	
	public ScoreKeeper scorer;
	public ArrayList<Level> levels;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Arcade game starting!!!!!");
		new Main();
		
		
		
	}
	
	public Main() {
		scorer = new ScoreKeeper();
		levels = new ArrayList<Level>();
		scanFiles();
		scorer.writeScoreFile();
		
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
			scorer.passScoreFile(file);
			System.out.println("Done Making File");
		}
		
		file = null;
		String fileName = "Level";
		try {
			for(int i = 1; i < 2; i++) {
				file = new FileReader("Level" + i + ".txt");
				levels.add(new Level(file));
			}
		} catch (IOException e) {
		    System.err.println(fileName + " does not exist."); 
		}
		
		
	}

}
