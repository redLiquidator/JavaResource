package period_202104_202105;

public class P20210530 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = -1;
		
		for(int i = 1 ; i <=20 ; i++){
			System.out.println(num+2);
			num = num+2;	
			sum = sum+num;
		}
		
		System.out.println(sum);

	}

}
