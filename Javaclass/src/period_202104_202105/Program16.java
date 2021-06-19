package period_202104_202105;

public class Program16 {

	public static void main(String[] args) {
		//Nested ternary operator(Greater of 3 numbers)
		int a=10;
		int b=20;
		int c=30;

		//Greater of 3 numbers
		int ans = (a>=b && a>=c) ? a: (b>=a && b>=c )?b:c;
		System.out.println(ans);

	}

}
