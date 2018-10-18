import java.io.FileReader;
import java.util.Scanner;

public class Level {
	
	private FileReader file;
	
	public Level(FileReader file) {
		this.file = file;
		this.readFile();
	}
	
	public void readFile() {
		Scanner s = new Scanner(file); 
		
		System.out.println(s.nextLine());
		
	}

}
