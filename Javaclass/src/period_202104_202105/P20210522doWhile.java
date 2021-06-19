package period_202104_202105;

public class P20210522doWhile {
	public static void main(String[] args) {
		
		System.out.println("while");
		int i = 1;
		while( i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n\n do While");
		int x = 1;
		do
		{
			System.out.println(x);
			x++;
		}while(x<=5);
		
		
		System.out.println("\n\n while");
		int i1 = 10;     //not executed at all
		while( i <= 5) {
			System.out.println(i1);
			i++;
		}
		
		System.out.println("\n\n do While");
		int x1 = 10;    //only do part is executed once
		do
		{
			System.out.println(x1);
			x++;
		}while(x<=5);
	}

}
