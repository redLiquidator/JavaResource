package period_202104_202105;

import java.util.Scanner;

//add two numbers
public class Program2 {

	public static void main(String[] args) {
		//we need scanner to accept data from user
		Scanner sc = new Scanner(System.in);
		
		//message from user to enter num 1
		System.out.println("Enter n1: ");
		//accpting num 1
		int n1 = sc.nextInt();
		
		//message for user to enter num 2
		System.out.println("Enter n2: ");
		//accepting num 2
		int n2 = sc.nextInt();
		
		//way 1 for output, storing output in var and printing var
		int ans = n1 + n2;
		System.out.println(ans);
		
		//way 2 for output, print output directly
		System.out.println(n1+n2);
		
		sc.close();
		
	}

}
