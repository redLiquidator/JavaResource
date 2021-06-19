package period_202104_202105;

import java.util.Scanner;

public class P20210523flag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//flags - nothing but any boolean variable that we create
		
		boolean isNotValid = true;
		
		do {			
				int n = sc.nextInt();
			if(n < 1 || n > 10) {
				System.out.println("error");
				isNotValid = true;
			}else {
				isNotValid = false;			
			}			
			
		//}while(isNotValid == true); the same phrase as the below line
		}while(isNotValid);
				System.out.println("bye");
	}

}
