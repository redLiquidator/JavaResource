package period_202106;

import java.util.Scanner;

public class P20210606ArrayOddNumber {

	public static void main(String[] args) {
		System.out.println("Enter the lengh of array");
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int array[] = new int[l];
		
		System.out.println("Enter each value of array");
		
		for(int i = 0 ; i < l ; i++) {
			array[i] = sc.nextInt();
		}
		
		
		System.out.println("odd values of the array are : ");
		
		for(int i = 0 ; i < l ; i++) {
			if(array[i]%2 == 1) {
				System.out.println(array[i]);
			}
		}
		
		
		
		
		
		

	}

}
