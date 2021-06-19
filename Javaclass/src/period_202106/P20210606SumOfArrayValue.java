package period_202106;

import java.util.Scanner;

public class P20210606SumOfArrayValue {

	public static void main(String[] args) {
		System.out.println("Enter the lengh of array");
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int array[] = new int[l];
		
		
		System.out.println("Enter each value of array");
		
		for(int i = 0 ; i < l ; i++) {
			array[i] = sc.nextInt();
		}
		
		
		System.out.println("Sum of each value of array is : ");
		
		int sum = 0;
		for(int i = 0 ; i < l ; i++) {
			sum = sum + array[i]; 
		}
		
		System.out.println(sum);
		

	}

}
