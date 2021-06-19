package period_202104_202105;

import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		switch(num) {
		case 10:        //if num == 10
			System.out.println("10");
			break;		// goes to the first line(the starting bracket)
						// if I delete this break; , 
						//	then the rest of the all lines are executed 
		case 20:		 //if num == 20
			System.out.println("20");
			break;
		case 30:		 //if num == 30
			System.out.println("30");
			break;
		default:
			 // means if none of above are true)
		   	System.out.println("Invalid input");
		}

	}

}
