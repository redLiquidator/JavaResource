package period_202104_202105;
import java.util.Scanner;

//Output, input and comments
public class Program1 {

	public static void main(String[] args) {
		// single line comment
		
		/*
		 * Multiple
		 * Line 
		 * Comments
		 * 
		 * */
		
		//Output
		//println will print & give new line
		System.out.println("Hello World");
		System.out.println("Line 2");
		//print will print but not give new line at end 
		System.out.print("Line 3");
		System.out.println("Line 4");
		
		//Input data
		//variable is a name given to any data in our program
		// sc : name of the object. command.  object programming
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		// n1 : variable
		int n1 = sc.nextInt();
		System.out.println(n1);
		
		
		
		
		
	}

}
