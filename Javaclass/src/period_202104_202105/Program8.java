package period_202104_202105;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		System.out.println("enter the radius: ");
		Scanner sc = new Scanner(System.in);
		
		
		int radius = sc.nextInt();
		double pi = 3.414;
		
		System.out.println(radius*radius*pi);

	}

}
