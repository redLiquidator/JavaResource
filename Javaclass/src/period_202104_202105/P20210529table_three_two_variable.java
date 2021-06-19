package period_202104_202105;

import java.util.Scanner;

public class P20210529table_three_two_variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("equation: num1 * 1~num2 ");
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		for(int i =1 ; i<=num2 ; i++) {
			System.out.println(num1 +" * "+ i +" = "+ num1*i);
		}
		

	}

}
