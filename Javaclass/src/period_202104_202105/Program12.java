package period_202104_202105;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//syntax : -var = condition ?  true : false;
		int a = 10;
		int b = 20;
		//will return 20 as condition is false, will return the false part
		int ans = (a > b)? a : b;
		System.out.println(ans);

		//will return 10 as condition is true, will return the true part
		ans = (a < b)? a : b;
		System.out.println(ans); 
		
		//In java, we use ternary operator directly in syso
		//instead of storing output in var, it will directly print to screen
		System.out.println(a < b ? a : b);
		
		//escape sequence only works in '' or ""
		System.out.println("Hello! \n Welcome");
		System.out.println("Hello! \t Welcome");
		
		System.out.println("Hello! \'Welcome\'");
		System.out.println("Hello! \"Welcome\"");
		System.out.println("Hello! \\Welcome\\");
		
	}

}
