package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONfilewritingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("Name", "sri");
		jsonobject.put("Age", "27");
		
		// to add an array
		
		JSONArray array = new JSONArray();
		array.add("magic eyes");
		array.add("magnetic smile");
		
		jsonobject.put("special qualities", array);
		
		FileWriter filewriter = new FileWriter("sri.json");
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();
		
	}

}
