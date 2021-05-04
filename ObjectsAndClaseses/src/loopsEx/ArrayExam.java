package loopsEx;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		
		int[] myArray1 = {8, 9, 12, 14, 16}; 
		System.out.println("myArray1: " + Arrays.toString(myArray1));
	
		int[] myArray2 = Arrays.copyOf(myArray1, 5);
		System.out.println("exact copy: " + Arrays.toString(myArray2));

		

		
	}

}

