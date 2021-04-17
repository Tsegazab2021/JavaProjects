package day3;

import java.util.Scanner;

public class Quesion4 {

	public static void main(String[] args) {

		
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = sc.nextInt();
		
		do
		{
			i--;
			if(i % 2 ==0) {
			System.out.println(i);
			}
		}
		
		while(i>1);
		
		sc.close();
	}

}
