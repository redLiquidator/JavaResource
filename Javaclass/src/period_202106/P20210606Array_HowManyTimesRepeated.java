package period_202106;

import java.util.Scanner;

public class P20210606Array_HowManyTimesRepeated {

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
		int count = 0;
		for(i = 0 ; i < l ; i++) {  
			if( input == array[i]) {
				count++;
	
			}
		}
		
		if(count == 0)  
		{
			System.out.println("Number not found");
		}else {
			System.out.println("Number "+input+" found "+count+" times");
		}	
		
	}

}
