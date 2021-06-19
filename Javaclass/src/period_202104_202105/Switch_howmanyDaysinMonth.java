package period_202104_202105;

import java.util.Scanner;

//how many days?
public class Switch_howmanyDaysinMonth {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		int days;
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31days");
				break;
			case 2:
				if(year%4==0 && year%100!=0 || year%400==0) {
					days=29;
				}else {
					days=28;
				}
				System.out.println(days+"days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30days");
				break;					
			default:
				System.out.println("enter a month");			
		}
	
	
	}	
}
