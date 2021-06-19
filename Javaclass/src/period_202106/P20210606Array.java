package period_202106;

import java.util.Scanner;

public class P20210606Array {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the length of an array:  ");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		
		int array[] = new int[l];
		
		for(int i=0; i<l ;i++) {
			System.out.println("Enter the value of the array: ");
			array[i] = sc.nextInt();
			//System.out.println("value of the array: "+array[i]); make this with new for loop!!
		}
		

	}

}
