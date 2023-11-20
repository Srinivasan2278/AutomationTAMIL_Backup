package fileWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "./Output/BufferWriter.txt"; 
		String content = " I am Batman";
		
		FileWriter filewriter = new FileWriter(location);
		
	
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		bufferedwriter.write(content);
		bufferedwriter.close();
	}

}
