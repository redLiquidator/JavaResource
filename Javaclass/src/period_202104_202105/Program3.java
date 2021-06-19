package period_202104_202105;

import java.util.Scanner;

//Find area of rectangle
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length: " );
		int l  =sc.nextInt();
		
		//way 1 to print
		System.out.print("Enter breadth: ");
		int b = sc.nextInt();
		
		//Addition might give unexpected results, so use ( )
		System.out.println("The area is: " + l*b);
		//System.out.println("The area is: " + (l+b));
		
		//way 2 to print
		System.out.println("The product of "+l+" and "+b+" is "+l*b);
		sc.close();
		
		

	}

}

//BODMAS bracket first