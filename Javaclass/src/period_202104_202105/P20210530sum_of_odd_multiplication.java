package period_202104_202105;

public class P20210530sum_of_odd_multiplication {

	public static void main(String[] args) {
			
		int sum = 0;
		for(int i=1; i<=13; i+=2) {
			int multiplied = i*(i+2);
			System.out.println("multiplied"+multiplied);
			sum =  sum + multiplied;	
			System.out.println("sum inside for loop"+sum);
		}
		
		System.out.println(sum);

	}

}
