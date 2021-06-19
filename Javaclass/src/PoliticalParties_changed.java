import java.util.Scanner;

public class PoliticalParties_changed {

	public static void main(String[] args) {
		//BJP Congress AAP JD SS -> 5 parties
				int i = 1;    //number of parties
				int sum = 0;  //total seats

				do {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the number of seats of party "+i +": ");

					int num_of_seat = sc.nextInt();
			


					//if num_of_seat<1 , re-enter
					if(num_of_seat<1 || num_of_seat>570) {
						System.out.println("Error! Enter between 1 to 570");
						//sum= sum - num_of_seat;
						//i--;
						continue;
					}
					sum= sum + num_of_seat;
					i++;
					//if sum>570, re-enter
					if(sum>570) {
						System.out.println("Error! the sum of all parties should not be bigger than 570");
						System.out.println("Enter data for all parties again.");
						sum = 0;
						i = 1;
						continue;
					}



					System.out.println("total seats: "+sum+"\n");

				}while(i<=5);  


				System.out.println("-----end of program-------");
			

	}

}
