package period_202104_202105;

//power-digit-sum
public class P20210530power_digit_sum {

	public static void main(String[] args) {
		//calculate 2^1000
		int num = (int) Math.pow(2, 1000);
		System.out.println("2^1000 is "+num);
		
		//get each digit of num -> add num to sum
		int sum = 0;
		int digit = 0;

		while(num>0) {
			digit = num%10;		
			sum = sum + digit;
			System.out.println("sum + digit = "+sum);					
			num = num/10;
		}
		
		System.out.println("sum of all digits is "+sum);
		

	}

}
