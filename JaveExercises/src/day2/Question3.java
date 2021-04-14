package day2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > 0)
        {
            System.out.println("Number is positive");
        }
        else if (num < 0)
        {
            System.out.println("Negative is negative");
        }
        else
        {
            System.out.println("Number is zero");
            
            sc.close();
            
         

        }

	}
	
}
	
	
	
	
