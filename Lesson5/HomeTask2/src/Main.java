import java.util.Random;
import java.util.Scanner;

public class Main {

	static Random random = new Random();
	static Scanner scan = new Scanner(System.in);
	static byte userNumber;
	static int randomNumber;
	static int loopCounter = 0;

	static byte userNumber() {
		System.out.println("Wprowadz wybrana przez siebie liczbe 1-30:");
		userNumber = scan.nextByte();

		while (userNumber < 0 || userNumber > 30) {
			System.out.println("Wprowadziles liczbe spoza zakresu!");
			System.out.println("Wprowadz wybrana przez siebie liczbe 1-30:");
			userNumber = scan.nextByte();
			if (userNumber > 0 && userNumber < 30) {
				break;
			}
		}
		return userNumber;
	}

	static int randomNumber() {
		do {
			randomNumber = random.nextInt(30) + 1;
			loopCounter++;
			System.out.println("Losowanie nr " + loopCounter + " twoja liczba to: " + randomNumber);

		} while (userNumber != randomNumber);
		System.out.println("Twoja liczba zostala wylosowana za: " + loopCounter + " razem.");

		return randomNumber;
	}

	public static void main(String[] args) {
		userNumber();
		randomNumber();
	}

}
