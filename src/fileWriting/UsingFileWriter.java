package fileWriting;

import java.io.FileWriter;
import java.io.IOException;

/*    
			  How to write a file in JAVA
			  ----------------------------
			  FileWriter =>  straight forward, direct interaction with files,less performance
			  BufferedWriter => Easiest way, performance wise  better, widely used
			  FileOutputStream => for writing raw data byte array information (eg.images)
			  Path => this also writes byte array
			  
			  
			 */

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		   
		// 1- location, 2- content
		
		String location = "./Output/FileWriter.txt"; // or (D:/Filewriter.txt)
		String content = " I am Ironman";
		
		FileWriter filewriter = new FileWriter(location);
		filewriter.write(content);
		
		filewriter.close();
		
		
	}

}
