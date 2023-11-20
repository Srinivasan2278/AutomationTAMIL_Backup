package fileReading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "./Output/BufferWriter.txt"; 
		FileReader filereader = new FileReader(location);
		
		
		BufferedReader reader = new BufferedReader(filereader);
		String contents = reader.readLine();
		System.out.println(contents);  // I am Batman.
		
		// to read multiple line from a file
		
		String location1 = "./Output/Multipleline.txt";
		FileReader filereader1 = new FileReader(location1);
		
		BufferedReader reader1 = new BufferedReader(filereader1);
		String contents1;
		
		while ((contents1= reader1.readLine())!=null) {
			System.out.println(contents1);
			
		}
		
	}

}


