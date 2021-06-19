package period_202104_202105;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num%3==0) {
			System.out.println("divisible by 3");
		}else {
			System.out.println("not divisible by 3");
		}

	}

}
