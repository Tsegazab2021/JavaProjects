package loopsEx;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		String[] array = new String[3];
		
		for (int i = 0; i < array.length;i++) {
			array[0] = sc.nextLine();
			array[1] = sc.nextLine();	
			array[2] = sc.nextLine();
			sc.close();
			
			System.out.println(array[i]);
		}
		
	}

}
