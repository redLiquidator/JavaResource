package period_202104_202105;

import java.util.Scanner;
// armstrong number
public class P20210522armstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n1: ");
		int n = sc.nextInt();
		int nCopy = n;
		int nCopy1 = n;
		
		double len = 0;
		double rem;
		double num =0;
		
		//counting num of digits in var len
		while(nCopy1 > 0) {
			rem = nCopy1 % 10;
			len++;
			nCopy1 = nCopy1 /10;
		}
		
		while(n>0) {
			rem = n%10;
			num = num + Math.pow(rem,len);
			n = n/10;
		}
		
		if(num == nCopy) {
			System.out.println("is armstrong");
		}else {
			System.out.println("is not armstrong");
		}
	}

	}
