import java.util.Random;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random randGen = new Random();
		String cont = "y";
		int sides;
		int i = 1;

		System.out.println("Welcome to the Grand Circus Casino!");

		System.out.println("How many sides should each die have?");
		sides = scan.nextInt();

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Roll " + i + ":");

			System.out.println(diceRoll1(sides, randGen));
			System.out.println(diceRoll2(sides, randGen));

			System.out.println("Roll again? (y/n)");
			scan.nextLine();
			cont = scan.next();
			++i;

		}

		System.out.println("Goodbye!");

		scan.close();
	}

	public static int diceRoll1(int sides, Random randGen) {
		return randGen.nextInt(sides) + 1;

	}

	public static int diceRoll2(int sides, Random randGen) {
		return randGen.nextInt(sides) + 1;

	}

}
