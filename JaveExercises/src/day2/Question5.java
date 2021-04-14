package day2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Age: " );
		
		int age = sc.nextInt();
		
		if(age >=18) {
			System.out.println("You are eligble to vote");
	}
	else {
		System.out.println("You are not eligble to vote");
		
		sc.close();
	}

	}
}
