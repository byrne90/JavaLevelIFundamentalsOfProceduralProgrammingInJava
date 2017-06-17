import java.util.Random;
import java.util.Scanner;

public class SuperFarmer {

	static int rabbitCount;
	static int sheepCount;
	static int pigCount;
	static int cowCount;
	static int horseCount;
	static boolean hasSmallDog = false;
	static boolean hasBigDog = false;

	static String[] diceOne = { "Wilk", "Krowa", "Swinia", "Owca", "Owca", "Owca", "Krolik", "Krolik", "Krolik",
			"Krolik", "Krolik", "Krolik" };
	static String[] diceTwo = { "Lis", "Kon", "Swinia", "Swinia", "Owca", "Owca", "Krolik", "Krolik", "Krolik",
			"Krolik", "Krolik", "Krolik" };

	static Random generator = new Random();

	static int throwFirstDice() {
		return generator.nextInt(diceOne.length);
	}

	static int throwSecondDice() {
		return generator.nextInt(diceTwo.length);
	}

	static void seeFarm() {
		System.out.println("Krolikow: " + rabbitCount);
		System.out.println("Owiec: " + sheepCount);
		System.out.println("Swin: " + pigCount);
		System.out.println("Krow: " + cowCount);
		System.out.println("Koni: " + horseCount);
		System.out.println("Maly pies: " + hasSmallDog);
		System.out.println("Duzy pies: " + hasBigDog);

	}

	static void throwDices() {

		int firstDice = throwFirstDice();
		int secondDice = throwSecondDice();
		String firstThrow = diceOne[firstDice];
		String secondThrow = diceTwo[secondDice];

		System.out.println("Wyrzuciles: " + firstThrow + " " + secondThrow);

		throwResults(firstThrow, secondThrow);

		if (!firstThrow.equals(secondThrow)) {
			throwResults(secondThrow, firstThrow);
		}
	}

	static void throwResults(String firstThrowValue, String secondThrowValue) {
		switch (firstThrowValue) {
		case "Krolik":
			if (secondThrowValue.equals("Krolik")) {
				rabbitCount = rabbitCount + ((rabbitCount + 2) / 2);
				break;
			}
			rabbitCount = rabbitCount + (rabbitCount + 1) / 2;
			break;
		case "Owca":
			if (secondThrowValue.equals("Owca")) {
				sheepCount = sheepCount + (sheepCount + 2) / 2;
				break;
			}
			sheepCount = sheepCount + (sheepCount + 1) / 2;
			break;
		case "Swinia":
			if (secondThrowValue.equals("Swinia")) {
				pigCount = pigCount + (pigCount + 2) / 2;
				break;
			}
			pigCount = pigCount + (pigCount + 1) / 2;
			break;
		case "Krowa":
			if (cowCount > 0) {
				cowCount = cowCount + (cowCount + 1) / 2;
			}
			break;
		case "Kon":
			if (horseCount > 0) {
				horseCount = horseCount + (horseCount + 1) / 2;
			}
			break;
		case "Lis":
			if (hasSmallDog == false) {
				System.out.println("Lis zjada wszytskie kroliki!");
				rabbitCount = 0;
				break;
			}
			System.out.println("Dobrze jest miec psa! Ochronil Twoje kroliki przed lisem!");
			hasSmallDog = false;
			break;
		case "Wilk":
			if (hasBigDog == false) {
				System.out.println("Wilk zjada zwierzeta!");
				rabbitCount = 0;
				sheepCount = 0;
				pigCount = 0;
				cowCount = 0;
				break;
			}
			System.out.println("Dobrze jest miec psa! Ochrania Twoje stado przed wilkiem!");
			hasBigDog = false;
		}
	}

	static void exchangeAnimals() {
		System.out.println("TABELA WYMIAN");
		System.out.println("(1.) 6 krolikow = 1 owca");
		System.out.println("(2.) 2 owce = 1 swinia");
		System.out.println("(3.) 3 swinie = 1 krowa");
		System.out.println("(4.) 2 krowy = 1 kon");
		System.out.println("(5.) 1 owca = 1 maly pies");
		System.out.println("(6.) 1 krowa = 1 duzy pies");

		int exchangeChoice = scanner.nextInt();
		int exchangeCount;

		switch (exchangeChoice) {
		case 1:
			if (rabbitCount < 6) {
				System.out.println("Masz za malo krolikow na wymiane!");
			}
			System.out.println("Ile owiec chcesz dostac?");
			exchangeCount = scanner.nextInt();
			if (rabbitCount % exchangeCount == 0) {
				sheepCount = sheepCount + exchangeCount;
				rabbitCount = rabbitCount - (exchangeCount * 6);
			} else {
				System.out.println("Masz za malo krolikow na wymiane!");
			}
			break;
		case 2:
			if (sheepCount < 2) {
				System.out.println("Masz za malo owiec na wymiane!");
			}
			System.out.println("Ile swin chcesz dostac?");
			exchangeCount = scanner.nextInt();
			if (sheepCount % exchangeCount == 0) {
				pigCount = pigCount + exchangeCount;
				sheepCount = sheepCount - (exchangeCount * 2);
			} else {
				System.out.println("Masz za malo owiec na wymiane!");
			}
			break;
		case 3:
			if (pigCount < 3) {
				System.out.println("Masz za malo swin na wymiane!");
			}
			System.out.println("Ile krow chcesz dostac?");
			exchangeCount = scanner.nextInt();
			if (pigCount % exchangeCount == 0) {
				cowCount = cowCount + exchangeCount;
				pigCount = pigCount - (exchangeCount * 6);
			} else {
				System.out.println("Masz za malo swin na wymiane!");
			}
			break;
		case 4:
			if (cowCount < 6) {
				System.out.println("Masz za malo krow na wymiane!");
			}
			System.out.println("Ile koni chcesz dostac?");
			exchangeCount = scanner.nextInt();
			if (cowCount % exchangeCount == 0) {
				horseCount = horseCount + exchangeCount;
				cowCount = cowCount - (exchangeCount * 6);
			} else {
				System.out.println("Masz za malo krow na wymiane!");
			}
			break;
		case 5:
			if (sheepCount == 0) {
				System.out.println("Masz za malo owiec aby kupic psa!");
			} else {
				sheepCount = sheepCount - 1;
				hasSmallDog = true;
				System.out.println("Kupiles malego psa! Lisy Ci juz nie groza!");
			}
			break;
		case 6:
			if (cowCount == 0) {
				System.out.println("Masz za malo krow zeby kupic duzego psa!");
			} else {
				cowCount = cowCount - 1;
				hasBigDog = true;
				System.out.println("Kupiles duzego psa! Wilki Ci juz nie groza!");
			}
		}
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Zaczynamy gre superfarmer!");
		int a = 3 / 2;
		System.out.println(a);

		int firstDice = throwFirstDice();
		int secondDice = throwSecondDice();
		while (!diceOne[firstDice].equals(diceTwo[secondDice])) {
			firstDice = throwFirstDice();
			secondDice = throwSecondDice();
			System.out.println("Wyrzuciles: " + diceOne[firstDice] + " " + diceTwo[secondDice]);
		}

		switch (diceOne[firstDice]) {
		case "Krolik":
			rabbitCount = 1;
			break;
		case "Owca":
			sheepCount = 1;
			break;
		case "Swinia":
			pigCount = 1;
			break;
		}

		for (;;) {
			System.out.println("MENU:");
			System.out.println("1. Obejrzyj swoje stado");
			System.out.println("2. Dokonaj wymiany");
			System.out.println("3. Rzuc koscmi");
			System.out.println("Podaj liczbe odpowiadajaca dzialaniu:");
			int inputChoice = scanner.nextInt();

			switch (inputChoice) {
			case 1:
				seeFarm();
				break;
			case 2:
				exchangeAnimals();
				break;
			case 3:
				throwDices();
				break;
			}
		}
	}
}
