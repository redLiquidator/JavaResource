package period_202104_202105;

public class P20210530sum_divided {

	public static void main(String[] args) {
		double sum = 0;
		
		for(double i =2; i<=98 ;i+=3){
			sum = sum +i/(i+1);
			//System.out.println("i/(i+1) is "+i/(i+1));
			//System.out.println("sum is "+sum);
		}
		
		System.out.println("sum is "+sum);
		

	}

}
