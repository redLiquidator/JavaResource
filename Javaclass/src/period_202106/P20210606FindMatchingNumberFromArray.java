package period_202106;

import java.util.Scanner;

public class P20210606FindMatchingNumberFromArray {

	public static void main(String[] args) {
		System.out.println("Enter the lengh of array");
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int array[] = new int[l];
		
		
		System.out.println("Enter each value of array");
		
		for(int i = 0 ; i < l ; i++) {
			array[i] = sc.nextInt();
		}
		
		
		
		
		System.out.println("Enter the value you want to find from array");
		
		int input =  sc.nextInt();
		int i;
		for(i = 0 ; i < l ; i++) {  
			if( input == array[i]) {
				//System.out.println("==========");
				//System.out.println(input);
				//System.out.println(array[i]);
				//System.out.println("==========");
				System.out.println("the input exists in array");
				break;
			}

		}
		
		if(i == l)  // remember!
		{
			System.out.println("Number not found");
		}
		
		
	}

}
