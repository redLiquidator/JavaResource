package period_202104_202105;

import java.util.Scanner;
//123 - > 321
public class ReverseOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
		
		int rem,num = 0 ;
		while(n>0) {
			rem = n % 10;
			num = rem + (num*10);
			n = n/10;
		}
		
		System.out.println(num);
	}

}
