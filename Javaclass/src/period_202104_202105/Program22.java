package period_202104_202105;

import java.util.Scanner;

//the number is divisible by 3 or 5
public class Program22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		if(num%5==0 || num%3==0){
			System.out.println("the number is divisible by 3 or 5");
		}else {
			System.out.println("the number is not divisible by 3 nor 5");
		}

	}

}
