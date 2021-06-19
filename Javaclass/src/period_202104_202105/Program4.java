package period_202104_202105;

import java.util.Scanner;

// Find the square of a number
public class Program4 {

	public static void main(String[] args) {
		System.out.print("enter the number : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int square = num*num;
		
		System.out.println(square);
		sc.close();

	}

}
