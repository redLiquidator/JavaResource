package period_202106;

import java.util.Scanner;

public class P20210606MatchingTwoArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the age of students");
		int age[] = new int[5];
		
		for(int i=0; i<5; i++) {
			age[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the id of students");
		int id[] = new int[5];
		
		for(int i=0; i<5; i++) {
			id[i] = sc.nextInt();
		}


		for(int i=0; i<5; i++) {
			System.out.println("Student's age : "+ age[i]+", id : "+id[i]);
		}
		
	
		
		
		

	}

}
