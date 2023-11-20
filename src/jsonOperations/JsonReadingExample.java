package jsonOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader filereader = new FileReader("sri.json");
		
		Object parsedobject = jsonparser.parse(filereader);
		
		JSONObject jsonobject = (JSONObject) parsedobject;
		
		String name = (String) jsonobject.get("Name");
		
		String age =   (String) jsonobject.get("Age");// In sri.json file the Age ="27".it is within doublequotes so we can consider it as a string value. 
		
		JSONArray array = (JSONArray) jsonobject.get("special qualities");
		
		Iterator iterator = array.iterator();
		
		System.out.println("Name is -"+ name);
		System.out.println("Age is -"+ age);
		
		while (iterator.hasNext()) {
			System.out.println("special quality -"+ iterator.next());
		}
		

	}

}
