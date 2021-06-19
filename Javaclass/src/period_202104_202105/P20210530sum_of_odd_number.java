package period_202104_202105;

public class P20210530sum_of_odd_number {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<=31;i++) {
			
			if(i%2 != 0) {
				sum = sum + i;
				System.out.println(sum);
			}
		
		}
		
		for(int i=1;i<=31;i+=2)
		{
			sum = sum + i;
			System.out.println(sum);
		}

	}

}
