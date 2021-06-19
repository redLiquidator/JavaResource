package period_202104_202105;

public class P20210530nested_for_loop {

	public static void main(String[] args) {
		//1    2    3    4
		//1    2    3    4
		//1    2    3    4
			for(int row=1; row <=3; row++) {
				for(int col = 1; col <=4;col++) {
					System.out.print(col+"\t");
				}
				System.out.println();
			}

	}

}
