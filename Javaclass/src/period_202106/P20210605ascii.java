package period_202106;

public class P20210605ascii {
	
	public static void main(String[] args) {
		for(int i=0; i<=255; i++){
			
			//System.out.println(i + " : " + (char)(i));
		}

	
	
		for(int r = 1 ; r<=4 ; r++) {
			
			for(int c = 1 ; c<=r ; c++ ) {
				System.out.print((char)(64+c) + "\t");			
			}			
			System.out.println();
		}
		
		for(int r = 1 ; r<=4 ; r++) {
			
			for(int c = 1 ; c<=r ; c++ ) {
				System.out.print((char)(64+r) + "\t");			
			}			
			System.out.println();
		}
		
		
		int num = 1;
		for(int r = 1 ; r<=4 ; r++) {
			
			for(int c = 1 ; c<=r ; c++ ) {
				System.out.print((char)(64+num) + "\t");
				num++;
			}			
			System.out.println();
		}
		
		
		
		
	
	}
}
