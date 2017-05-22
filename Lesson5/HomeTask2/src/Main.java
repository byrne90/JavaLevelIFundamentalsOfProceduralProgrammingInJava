import java.util.Random;
import java.util.Scanner;

public class Main {

	static Random random = new Random();
	public static Scanner scanner = new Scanner(System.in);
	static int userNumber;
	static int randomNumber;
	static int loopCounter = 0;

	static int getUserNumber() {
		System.out.println("Wprowadz wybrana przez siebie liczbe 1-30:");
		userNumber = getScanner().nextInt();

		validateInt(userNumber, 1, 30, "Wprowadziles niewlasciwa liczbe!");
		return userNumber;
	}

	static int getRandomNumber() {
		do {
			randomNumber = random.nextInt(30) + 1;
			loopCounter++;
			System.out.println("Losowanie nr " + loopCounter + " twoja liczba to: " + randomNumber);

		} while (userNumber != randomNumber);
		System.out.println("Twoja liczba zostala wylosowana za: " + loopCounter + " razem.");

		return randomNumber;
	}

	static int validateInt(int value, int min, int max, String errorMessage) {
		while (value < min || value > max) {
			System.out.println(errorMessage);
			value = getScanner().nextInt();
			userNumber = value;
		}
		return value;
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

	public static void main(String[] args) {
		getUserNumber();
		getRandomNumber();
	}

}
