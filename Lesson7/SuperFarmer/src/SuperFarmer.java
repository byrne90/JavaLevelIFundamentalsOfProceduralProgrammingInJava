import java.util.Random;
import java.util.Scanner;

public class SuperFarmer {

	static int rabbitCount;
	static int sheepCount;
	static int pigCount;
	static int cowCount;
	static int horseCount;
	static int smallDogCount;
	static int bigDogCount;

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
		System.out.println("Maly pies: " + smallDogCount);
		System.out.println("Duzy pies: " + bigDogCount);

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
			if (smallDogCount <= 0) {
				System.out.println("Lis zjada wszytskie kroliki!");
				rabbitCount = 0;
				break;
			}
			System.out.println("Dobrze jest miec psa! Ochronil Twoje kroliki przed lisem!");
			smallDogCount = smallDogCount - 1;
			break;
		case "Wilk":
			if (bigDogCount <= 0) {
				System.out.println("Wilk zjada zwierzeta!");
				rabbitCount = 0;
				sheepCount = 0;
				pigCount = 0;
				cowCount = 0;
				break;
			}
			System.out.println("Dobrze jest miec psa! Ochrania Twoje stado przed wilkiem!");
			bigDogCount--;
			break;
		}
	}

	static void exchangeAnimalMechanism(int countInputAnimals, int countOutputAnimals, String nameOfInputAnimals,
			String nameOfOutputAnimals, int minAnimals) {
		if (countInputAnimals < minAnimals) {
			System.out.println("Masz za malo " + nameOfInputAnimals + " na wymiane!");
		}
		System.out.println("Ile " + nameOfOutputAnimals + " chcesz dostac?");
		int exchangeCount = scanner.nextInt();

		if (minAnimals * exchangeCount <= countInputAnimals) {
			countOutputAnimals = countOutputAnimals + exchangeCount;
			countInputAnimals = countInputAnimals - (minAnimals * exchangeCount);
			System.out.println("Wymieniles " + (minAnimals * exchangeCount) + " " + nameOfInputAnimals + " na "
					+ exchangeCount + " " + nameOfOutputAnimals);
		} else {
			System.out.println("Masz za mala ilosc " + nameOfInputAnimals);
			int maxNumbersOfAnimalsToExchange = countInputAnimals / minAnimals;
			System.out
					.println("Maksymalnie mozesz dostac " + maxNumbersOfAnimalsToExchange + " " + nameOfOutputAnimals);
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

		switch (exchangeChoice) {
		case 1:
			exchangeAnimalMechanism(rabbitCount, sheepCount, "Krolikow", "Owiec", 6);
			break;
		case 2:
			exchangeAnimalMechanism(sheepCount, pigCount, "Owiec", "Swin", 2);
			break;
		case 3:
			exchangeAnimalMechanism(pigCount, cowCount, "Swin", "Krow", 3);
			break;
		case 4:
			exchangeAnimalMechanism(cowCount, horseCount, "Krow", "Koni", 2);
			break;
		case 5:
			exchangeAnimalMechanism(sheepCount, smallDogCount, "Owiec", "Malych Psow", 1);
			break;
		case 6:
			exchangeAnimalMechanism(cowCount, bigDogCount, "Krow", "Duzych Psow", 1);
			break;
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
