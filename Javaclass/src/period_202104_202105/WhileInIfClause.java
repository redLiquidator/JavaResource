package period_202104_202105;

import java.util.Scanner;

public class WhileInIfClause {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n1: ");
			int n1 = sc.nextInt();
			System.out.println("Enter n2: ");
			int n2 = sc.nextInt();
			
			if(n1<=n2) {
				while(n1<=n2) 
				{	
					System.out.println(n1);
					n1++;
				}
						
			} else {
				while(n1>=n2) 
				{	
					System.out.println(n2);
					n2++;
				}			
			}
	}

}
