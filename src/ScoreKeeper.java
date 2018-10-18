import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScoreKeeper {
	
	private FileReader file;
	private int highScore;
	
	public ScoreKeeper() {
		highScore = 0;
		file = null;
		
	}
	
	public void readScoreFile(FileReader file) {
		this.file = file;
	}
	
	public void loadLeaderBoard() {
		
	}
	
	public void writeScoreFile() {
		
	}


}
