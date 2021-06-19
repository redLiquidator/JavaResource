package period_202104_202105;

import java.util.Scanner;

public class P20210529pivonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter terms: ");
		int terms = sc.nextInt();
		
		int n1 = 0, n2 = 1, fib=1;
		System.out.print(n1+"\t"+n2);
		
		for(int i=1; i<=(terms-2);i++) {
			fib = n1+n2;
			System.out.print("\t"+ fib);
			n1 = n2;
			n2 = fib;
		}
		
	}

}
