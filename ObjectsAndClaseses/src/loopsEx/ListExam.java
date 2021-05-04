package loopsEx;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("Kibrom");
		myList.add("Grmay");
		myList.add("Sami");
		myList.add("Sara");
		System.out.println(myList.size());
		
		for(int a =0; a < myList.size(); a++) {
			System.out.println(myList.get(a));
		}
	}

}
