package period_202104_202105;

import java.util.Scanner;
//individual digit
public class GetEveryDigitofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		int rem;
		while( n > 0 ) {
			rem = n % 10;
			System.out.println(rem);
			n = n / 10;
		}

	}

}
