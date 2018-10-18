import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScoreKeeper {
	
	private FileReader file;
	
	public ScoreKeeper() {
		
	}
	
	public void passScoreFile(FileReader file) {
		this.file = file;
	}
	
	public void writeScoreFile() {
		try {
			Files.write(Paths.get("scores.txt"), "".getBytes());
			System.out.println("Done writing to file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
