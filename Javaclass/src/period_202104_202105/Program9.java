package period_202104_202105;

import java.util.Scanner;
//swap values
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Values before swap");
		System.out.println("a : "+a+"-b: " +b);
		
		temp = a;
		a=b;
		b=temp;
		
		
		System.out.println("Values before swap");
		System.out.println("a : "+a+"-b: " +b);

	}

}
