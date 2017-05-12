import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Wprowadz dowolna liczbe z zakresu od 1-30:");
		Scanner scan = new Scanner(System.in);
		int userNumber = scan.nextInt();
		int random;
		int loopCounter = 0;
		Random generator = new Random();

		do {

			random = generator.nextInt(29 + 1);
			System.out.println("Losowa liczba to " + random);
			loopCounter++;
		}

		while (userNumber != random);

		System.out.println("Twoja liczba zostala wylosowana za: " + loopCounter + " razem.");

	}

}
