import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static Random random = new Random();

	static int school;
	static boolean grade;
	static double randomGrade;
	static double sum;
	static int arraySize;
	static int loopCounter = 0;
	static double mediana = 0;
	static double highestGrade = 0;
	static double lowestGrade = 7;

	static double[] array;

	static int chooseSchool() {
		System.out.println("Wprowadz liczbe odpowiadajaca szkole: ");
		System.out.println("1. podstawowa");
		System.out.println("2. gimnnazjum");
		System.out.println("3. liceum");
		school = scan.nextInt();

		while (school < 0 || school > 3) {
			System.out.println("Wprowadziles ZLA liczbe wprowadz ja jeszcze raz:");
			System.out.println("1. podstawowa");
			System.out.println("2. gimnnazjum");
			System.out.println("3. liceum");
			school = scan.nextInt();
			if (school > 0 && school < 3) {
				break;
			}
		}
		return school;
	}

	static int createaArray() {
		switch (school) {
		case 1:
			arraySize = 4;
			array = new double[arraySize];
			break;
		case 2:
			arraySize = 6;
			array = new double[arraySize];
			break;
		case 3:
			arraySize = 7;
			array = new double[arraySize];
			break;
		}
		return arraySize;
	}

	static double[] fillInArrays() {
		for (int i = 0; i < array.length; i++) {
			grade = random.nextBoolean();
			randomGrade = random.nextInt(6) + 1;
			if (randomGrade != 6 && grade == true) {
				randomGrade = randomGrade + 0.5;
			}
			array[i] = randomGrade;
		}
		return array;
	}

	static void calculateAverage() {
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		System.out.println("Twoja srednia to: " + (sum / array.length));
	}

	static double calculateMediana() {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		if (array.length % 2 == 0) {
			double srednia;
			srednia = array[array.length / 2] + array[(array.length / 2) - 1];
			mediana = srednia / 2.0;
		} else {
			mediana = (double) array[array.length / 2];
		}
		System.out.println("Mediana = " + mediana);
		return mediana;
	}

	static void getBestGrade() { // do zrobienia takze wg wzoru GetWorstGrade
									// Arrays.sort()
		for (int i = 0; i < array.length; i++) {
			if (array[i] > highestGrade) {
				highestGrade = array[i];
			}
		}
		System.out.println("Najwyzsza ocena: " + highestGrade);
	}

	static void GetWorstGrade() {
		Arrays.sort(array);
		System.out.println("Najgorsza ocena to: " + array[0]);

	}

	static void showRepetitionDanger() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				System.out.println("JESTES ZAGROZONY!!!");
			}
		}
	}

	public static void main(String[] args) {
		chooseSchool();
		createaArray();
		fillInArrays();
		calculateAverage();
		calculateMediana();
		getBestGrade();
		GetWorstGrade();
		showRepetitionDanger();

	}

}
