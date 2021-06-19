package period_202106;

import java.util.Scanner;

public class P20210613TwoArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of students");
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int id[] = new int[l];
		int age[] = new int[l];
		
		for(int i = 0 ; i < l ; i++) {
		
			System.out.println("enter id of student "+ i);
			id[i] = sc.nextInt();
			
			System.out.println("Enter age of students "+ i);
			age[i] = sc.nextInt();
				
		}
		
		int maxAge = age[0];
		int indexForMaxAge = 0 ;
		for(int i = 0 ; i < l ; i++) {
			
			if(maxAge<age[i]) {
				maxAge = age[i];
				indexForMaxAge = i;
			}		
		}
		
		
		System.out.println("id of max age :"+ id[indexForMaxAge]);
		System.out.println("max age :"+maxAge);
		

		
		

	}

}
