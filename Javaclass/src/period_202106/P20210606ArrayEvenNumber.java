package period_202106;

import java.util.Scanner;

public class P20210606ArrayEvenNumber {

	public static void main(String[] args) {
		System.out.println("Enter the lengh of array");
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		
		int array[] = new int[l];
		
		int i;
		for(i = 0; i<l ; i++) {
			System.out.println("Enter the value of array");
			array[i] = sc.nextInt();
		}
		
		for(i = 0; i<l ; i= i+2) {
			System.out.println(array[i]);
		}
		
		

	}

}
