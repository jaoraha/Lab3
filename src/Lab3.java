import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Declare input variable.
		int num;

		// Declare variable to allow "continue" option.
		String cont = "y";

		// While loop to allow "continue" option.
		while (cont.equalsIgnoreCase("y")) {

			// Prompt user and obtain input.
			System.out.print("Enter a number between 1 and 100: ");
			num = scan.nextInt();
			System.out.println();

			// If statement used to ensure num is a valid entry, i.e. between 1-100).
			if (num < 1 || num > 100) {
				System.out.println("The number is not between 1 and 100!");

				// else statement with conditional actions based on user input assigned to num.
			} else {
				if (num >= 2 && num <= 25 && num % 2 == 0) {
					System.out.println("Even and less than 25.");
				} else if (num >= 26 && num <= 60) {
					System.out.println("Even.");
				} else if (num > 60 && num % 2 == 0) {
					System.out.println(num + " Even.");
				} else if (num > 60 && num % 2 != 0) {
					System.out.println(num + " Odd and over 60.");
				} else {
					System.out.println(num + " Odd.");
				}
			}
			// Prompt user if they want to continue, obtain input.
			System.out.println();
			System.out.print("Continue? (y/n): ");
			cont = scan.next();
			System.out.println();

		}
		
		// Message notifying user that the program has ended.
		System.out.println("Bye!");
	}
}
