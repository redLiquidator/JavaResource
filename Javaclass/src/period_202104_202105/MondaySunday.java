package period_202104_202105;

import java.util.Scanner;

public class MondaySunday {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number between 1-7");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:       
			System.out.println("Monday");
			break;		
		case 2:		
			System.out.println("Tuesday");
			break;
		case 3:       
			System.out.println("Wednesday");
			break;		
		case 4:		
			System.out.println("Thursday");
			break;
		case 5:		
			System.out.println("Friday");
			break;
		case 6:       
			System.out.println("Saturday");
			break;		
		case 7:		
			System.out.println("Sunday");
			break;
		
		default:
			 // means if none of above are true)
		   	System.out.println("Invalid input");
		}

	}

}
;;