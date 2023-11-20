package fileWriting;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

		String location = "./Output/Usingpath.txt"; 
		String content = " I am Superman";
		
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
	}

}
