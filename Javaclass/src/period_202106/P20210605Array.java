package period_202106;

import java.util.Scanner;

public class P20210605Array {

	public static void main(String[] args) {
		
		int abc[] = new int[5];
		int []xyz = new int[10];
		
		int []pqr = {1,2,3,4}; //storing default values in array
		System.out.println(pqr[3]);
		
		pqr[2] =300;
		System.out.println(pqr[2]);
		
		//accept value from user
		//length = 5 but last index num is 4. always length-1 because it starts from zero.
		
		//Accept value from user
		System.out.println("accept array value:  ");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter num: ");
			abc[i] = sc.nextInt();
		}
		System.out.println("print array value:  ");
		
		for(int i = 0; i<5; i++) {
			System.out.println(abc[i]);
		}

	}

}
