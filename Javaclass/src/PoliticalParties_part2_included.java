import java.util.Scanner;

//2021.06.06
public class PoliticalParties_part2_included {
	

	public static void main(String[] args) {
		// BJP Congress AAP JD SS -> 5 parties
		int i = 1; // number of parties
		int sum = 0; // total seats
		int num_of_seat[] = new int[5]; // seat of 5 parties.

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the number of seats of party " + i + ": ");
			System.out.println("Party number: BJP=1, Cong=2, AAP=3, JD=4, SS=5");

			num_of_seat[i - 1] = sc.nextInt();

			// if num_of_seat<1 , re-enter.
			if (num_of_seat[i - 1] < 1 || num_of_seat[i - 1] > 570) {
				System.out.println("Error! Enter between 1 to 570");
				continue;
			}

			sum = sum + num_of_seat[i - 1];
			System.out.println("total seats: " + sum + "\n");
			i++;

			// if sum>570, re-enter all.
			if (sum > 570) {
				System.out.println("Error! the sum of all parties should not be bigger than 570");
				System.out.println("Enter data for all parties again.");
				sum = 0;
				i = 1;
				continue;
			}

		} while (i <= 5);

		System.out.println("-----Voting Finished. Program starts to find a winner/winners ------");

		// if num_of_seat>287, won.
	
		for (int index = 0; index < 5; index++) {
			// System.out.println(num_of_seat[index]);

			if (num_of_seat[index] > 287) {
				int partyNumber = index+1;
				System.out.println("party " + partyNumber + " is majority. This party has won.");
				//break;
				System.exit(0); // ...0_0 program should be finished
			}
		}

		// if bjp+ss, cong+aap, cong+jd, cong+jd+aap, aap+jd - any of these combinations >287, it wins.
		// Party number : BJP=1, Cong=2, AAP=3, JD=4, SS=5
		if (num_of_seat[0] + num_of_seat[4] > 287) {
			System.out.println("bjp+ss is majority. They have won.");
		} else if (num_of_seat[1] + num_of_seat[2] > 287) {
			System.out.println("cong+aap is majority. They have won.");
		} else if (num_of_seat[1] + num_of_seat[2] + num_of_seat[3] > 287) {
			System.out.println("cong+aap+jd is majority. They have won.");
		} else if (num_of_seat[2] + num_of_seat[3] > 287) {
			System.out.println("aap+jd is majority. They have won.");
		} else {
			System.out.println("We have no winner.");
		}

		System.out.println("=====The end of program=====");

	}
	

}
