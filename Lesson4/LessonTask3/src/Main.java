import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Wprowadz dowolna liczbe z zakresu od 1-30:");
		Scanner scan = new Scanner(System.in);
		int userNumber = scan.nextInt();
		int random = 1;
		int loopCounter = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();

		while (loopCounter < 1) {
			Random generator = new Random();
			random = generator.nextInt(29 + 1);
			System.out.println("Losowa liczba to " + random);
			list.add(random);

			int arraySize = list.size();

			if (userNumber == random) {
				System.out.println("Twoja liczba zostala wylosowana za: " + arraySize + " razem.");
				loopCounter++;

			}

		}
	}

}
