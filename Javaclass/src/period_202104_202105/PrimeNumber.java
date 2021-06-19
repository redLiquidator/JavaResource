package period_202104_202105;

import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n1: ");
		int n=sc.nextInt();
		
		int c=2;
		while(c < n) {
			if(n%c ==0) {
				break;
			}
			c++;
		}
		
		if(c==n)
		{
			System.out.println("Number is Prime");
		}else
		{
			System.out.println("Number is not Prime");
		}

	}

}
