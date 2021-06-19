package period_202106;

import java.util.Scanner;

public class P20210613TwoDimentionalArray_sum2 {

	public static void main(String[] args) {
	
		int array[][] = new int[3][3]; 


		
	//add values
	for(int row =0; row<3 ; row++) {
		for(int col=0;col<3;col++) {
			
			System.out.println("Enter Value for "+ row + " - " + col + ":  ");
			
			Scanner sc = new Scanner(System.in);	
			int l = sc.nextInt();
			array[row][col] = l;
			
		}
		System.out.println();
	}
	
	//print sum of row
	int sumRow = 0; 
	for(int row =0; row<3 ; row++) {
		
		sumRow = 0;
		for(int col=0;col<3;col++) {
			sumRow = sumRow + array[row][col];
		}
		System.out.println("Sum of Row "+row+": "+sumRow);
	}
	
	System.out.println("================");
		 
	//print sum of col
	int sumCol = 0; 
	for(int col= 0;col<3;col++) {
		sumCol = 0;
		for(int row = 0 ; row <3; row++) {
			sumCol = sumCol +array[row][col];
		}
		System.out.println("Sum of Col"+col+": "+sumCol);
	}
	
	
	

	}

}
