package period_202106;

import java.util.Scanner;

public class P20210613TwoDimentionalArray_UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		
		//input values
		for(int row = 0; row <3 ; row++) {
			for(int col = 0 ; col <3; col++) {
				System.out.println("Enter Value for "+ row + " - " + col + ":  ");
				arr[row][col] = sc.nextInt();
				}
		}
		
		//print values
		for(int row =0; row<3 ; row++) {
			for(int col=0;col<3;col++) {
				System.out.print(arr[row][col]);	
			}
			System.out.println();
		}
		

	}

}
