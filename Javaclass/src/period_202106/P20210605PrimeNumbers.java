package period_202106;

public class P20210605PrimeNumbers {

	public static void main(String[] args) {
		int i ;
		int num;
		
		for(num = 2; num <= 20; num++) {
			
			for(i = 2; i<num; i++) {
				
				if(num%i == 0) {
					break;
				}
			}
			if(num == i) {
				System.out.println(num);
			}
		}

	}

}
