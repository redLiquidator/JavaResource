package period_202106;

import java.util.Scanner;

public class P20210605nestedForLoop_asterics {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		for(int r = 1 ; r<=4 ; r++) {
			
			for(int c = 1 ; c<=r ; c++ ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for(int r = 1 ; r<=4 ; r++) {
			
			for(int c = 1 ; c<=r ; c++ ) {
				System.out.print(c);
			}
			
			System.out.println();
		}
		
		
		for(int r = 1 ; r<=4 ; r++) {
			
			for(int c = 1 ; c<=r ; c++ ) {
				System.out.print((c+r)%2);
				
			}
			
			System.out.println();
		}

	}

}
