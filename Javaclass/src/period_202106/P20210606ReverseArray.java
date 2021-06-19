package period_202106;

import java.util.Scanner;

public class P20210606ReverseArray {

	public static void main(String[] args) {
		System.out.println("Enter the length of array");
		Scanner sc =  new Scanner(System.in);
		
		int l = sc.nextInt();
		
		int array[] = new int[l];
		
		for(int i = l-1 ; i >= 0 ; i--) {
			System.out.println("Enter the value of array["+i+"]");
			array[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i< l ; i++) {
			System.out.println("array["+i+"] : "+array[i]);
		}
		

	}

}
