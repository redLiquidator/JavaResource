import java.util.Scanner;

public class PoliticalParties {

	public static void main(String[] args) {
		//BJP Cong(ress) AAP JD SS -> 5 parties
		int i = 1;    //number of parties
		int sum = 0;  //total seats

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number of seats of "+i+"th party: ");

			int num_of_seat = sc.nextInt();
			sum= sum + num_of_seat;
			i++;
			// sum =+num_of_seat;


			//if num_of_seat<1 , re-enter
			if(num_of_seat<1) {
				System.out.println("enter between 1 to 570");
				sum= sum - num_of_seat;
				i--;
				continue;
			}

			//if sum>570, re-enter
			if(sum>570) {
				System.out.println("the sum should not be bigger than 570");
				sum= sum - num_of_seat;
				i--;
				continue;
			}



			System.out.println("total seats: "+sum+"\n");

		}while(i<=5);  


		System.out.println("-----end of program-------");
	}

}
