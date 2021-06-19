package period_202104_202105;

import java.util.Scanner;

//Accept three numbers and find their average
public class Program6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first num: ");
		int first = sc.nextInt();
		System.out.print("Enter the second num: ");
		int second = sc.nextInt();
		System.out.print("Enter the third num: ");
		int third = sc.nextInt();
		
		System.out.println("Average : "+(first+second+third)/3);
		sc.close();
	}
	
}
