package period_202104_202105;

import java.util.Scanner;

public class P20210522palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n1: ");
		int n = sc.nextInt();
		int nCopy = n;
		
		int rem,num =0;
		while(n>0) {
			rem = n%10;
			num = rem + (num*10);
			n = n/10;
		}
		
		if(num == nCopy) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
	}

}
