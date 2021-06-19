package period_202106;

public class P20210613TwoDimentionalArray_sum {

	public static void main(String[] args) {
		int firstArray[][] = new int[2][2]; 
			firstArray[0][0] = 1 ;
			firstArray[0][1] = 2 ;
			firstArray[1][0] = 3 ;
			firstArray[1][1] = 4 ;
		
		int secondArray[][] = new int[2][2]; 
			secondArray[0][0] = 2 ;
			secondArray[0][1] = 3 ;
			secondArray[1][0] = 4 ;
			secondArray[1][1] = 5 ;

			

		int resultArray[][] = new int[2][2]; 
		
		//add values
		for(int row =0; row<2 ; row++) {
			for(int col=0;col<2;col++) {
				resultArray[row][col]= firstArray[row][col] + secondArray[row][col];
				
			}
			System.out.println();
		}
		
		//print values
		for(int row =0; row<2 ; row++) {
			for(int col=0;col<2;col++) {
				//resultArray[row][col]= secondArray[row][col] + secondArray[row][col];
				System.out.print(resultArray[row][col] + "\t");	
			}
			System.out.println();
		}
		
		
		

	}

}
