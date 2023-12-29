package Project;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.*;


public class BigData {
	
	
	public static void main(String[] args) throws Exception{
		
		Scanner console = new Scanner(System.in);
		System.out.println("Input year: ");
		int year = console.nextInt();
		
		String data = "https://aa.usno.navy.mil/api/eclipses/solar/year?year=" + year;
		
		console.close();
		
		
		URL url = new URL(data);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		JSONParser jsonParser = new JSONParser(); 
		JSONObject myObject = (JSONObject)jsonParser.parse(br);
		
		JSONArray eclipseAll = (JSONArray)myObject.get("eclipses_in_year");
		JSONObject e = (JSONObject) eclipseAll.get(0);
		JSONObject j = (JSONObject) eclipseAll.get(1);

		String ev =(String) e.get("event");
		String ev2 = (String) j.get("event");

		
		System.out.println("Year: " + year);
		System.out.println("Number of eclipses: " + eclipseAll.size());
		System.out.println("1. Event: " + ev);
		System.out.println("2. Event: " + ev2);
		

	}

}
