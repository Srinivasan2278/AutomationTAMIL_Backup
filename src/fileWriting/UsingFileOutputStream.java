package fileWriting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "./Output/FOS.txt"; 
		String content = " I am Antman";
		
		FileOutputStream outputstream = new FileOutputStream(location);
		byte[] writethis= content.getBytes();
		outputstream.write(writethis);
		outputstream.close();
	}

}
