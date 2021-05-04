package day4;

public class Q1ArrayInt {

	public static void main(String[] args) {

		// Write a Java program to calculate the average value of array integers.

		int[] integers = new int[] { 5, 7, 9, 10, 12 };
		int sum = 0;
		for (int i = 0; i < integers.length; i++)
			sum = sum + integers[i];
		double avg = sum / integers.length;

		System.out.println("The average is: " + avg);
	}

}
