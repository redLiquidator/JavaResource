package period_202104_202105;

import java.util.Scanner;

public class P20210529factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n1: ");
		int n1 = sc.nextInt();
		
		int fact =1;
		
		for(int i=1;i<=n1;i++) {
			fact = fact*i;
		}
		
		System.out.println(fact);
	}

}
