package period_202104_202105;

import java.util.Scanner;

public class Switch_price {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price: ");
		int price = sc.nextInt();
		
		switch(price) 
		{
			case 10:		
			case 20:
			case 30:
					System.out.println("Not expensive");
					break;
			case 40:
			case 50:
			case 60:
					System.out.println("Little expensive");
					break;
			case 70:
			case 80:
					System.out.println("Very expensive");
					break;
				default:
					System.out.println("Enter correct price");
		
		}

	}

}
