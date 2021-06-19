package period_202104_202105;

import java.util.Scanner;

public class P20210522calculator_dowhile_recalculate {

	
	public static void main(String[] args) {
		
		
		int cal = 1;
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int n1=sc.nextInt();
		System.out.println("Enter num1: ");
		int n2=sc.nextInt();
		
		System.out.println("1. Add ");
		System.out.println("2. Sub ");
		System.out.println("3. Mul \n4. Div  \nEnter choice num: ");
		int choice = sc.nextInt();
		
		switch(choice) 
		{
			case 1: 
				System.out.println(n1+n2);
				break;
			case 2:
				System.out.println(n1-n2);
				break;
			case 3:
				System.out.println(n1*n2);
				break; 
			case 4:
				System.out.println(n1/n2);
				break;
			default:
			
					
		}
		 System.out.println("do you wish to calculate? press 1 for yes");
		 
		 cal =sc.nextInt();
		
		}while( cal ==1 );
		System.out.println("bye bye");
		
		
	}
}
