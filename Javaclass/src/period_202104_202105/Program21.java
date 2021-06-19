package period_202104_202105;

import java.util.Scanner;
//Find if number is divisible by 3 and 5
public class Program21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		if(num%5==0 && num%3==0) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
