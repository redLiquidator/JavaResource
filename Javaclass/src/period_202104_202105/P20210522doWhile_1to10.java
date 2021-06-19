package period_202104_202105;

import java.util.Scanner;

public class P20210522doWhile_1to10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		do {
			
			System.out.println("Enter n: ");
			n = sc.nextInt();	
			
		}while(n < 1 || n > 10);
		
		
		int x;
		
		do 
		{
			System.out.println("Enter x: ");
			x = sc.nextInt();
			if(x < 1 || x > 10) {
				System.out.println("only enter num between 1-10");
			}
			else
			{
				break;
			}
			
		}while(true);   //boolean true
		
		System.out.println("end of program");

	}

}
