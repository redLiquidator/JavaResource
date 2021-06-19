package period_202106;

public class P20210605factorialWithForLoop {

	public static void main(String[] args) {

		for(int num = 5 ; num <=10; num++) {
			
			int fact = 1;
			for(int i = 1; i<=num ; i++){
				fact = fact *i ;	
			}
			System.out.println("Factorial of "+num +" is : "+ fact);
		}

	}

}
