package period_202104_202105;

public class P20210530sum_plus_minus_alternatively {

	public static void main(String[] args) {
		//int minusNumber = 2; 
		//int plusNumber = -1;
		
		int ActualNumber = 0;
		int sum = 0;
		
		for(int i =1;i<=11;i++){
			
			if(i%2 != 0) {
				ActualNumber = (-1)*i;
				//System.out.println((-1)*i);
				sum = sum + ActualNumber;
			}else {
				ActualNumber = (1)*i;
				//System.out.println(i);
				sum = sum + ActualNumber;	
			}		
		}
		
		System.out.println(sum);

	}

}
