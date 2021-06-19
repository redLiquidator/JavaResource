package period_202104_202105;

import java.util.Scanner;

//Simple Interest ((principle*rate*time)/100) 
public class Program5 {
	public static void main(String[] args) {
		//Question: difference between creating one Scanner and multiple Scanners?
		System.out.print("Enter principle: ");
		Scanner sc = new Scanner(System.in);
		int principle = sc.nextInt();
		
		System.out.print("Enter rate : ");
		//Scanner sc1 = new Scanner(System.in);
		float rate = sc.nextFloat();
		
		System.out.print("Enter time : ");
		//Scanner sc2 = new Scanner(System.in);
		int time = sc.nextInt();
		
		System.out.println((principle*rate*time)/100);
		
		sc.close();

		
	}
}
