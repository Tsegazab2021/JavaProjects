package loopsEx;

import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		
		// Create a HashMap object called capitalCities
	    Map<String, String> students = new HashMap<>();

	    students.put("America", "Chris");
	    students.put("Tigray", "Sami");
	    System.out.println(students.get("America"));
	    System.out.println(students.keySet());
	    System.out.println(students.values());
	    System.out.println(students.entrySet());
	    
	    
		
}
}