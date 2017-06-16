import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	// skrocic uzupelnianie tablicy, przekazywanie booleana do metody tworzacej
	// tablice, metoda z boolean rozszerzona do calego sudoku

	static int[][] sudokuArray = new int[9][9];

	static int validationInt;
	static int difficultyLevel;
	static boolean duplicates = true;
	static Random generator = new Random();
	static ArrayList<Integer> numbers = new ArrayList<Integer>();

	static void schuffleNumbers() {
		for (int i = 1; i < 10; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
	}

	static int getDifficultyLevel() {
		System.out.println("Wybierz poziom trudnosci: ");
		System.out.println("1. latwy");
		System.out.println("2. sredni");
		System.out.println("3. trudny");
		System.out.println("4. hard");
		difficultyLevel = getScanner().nextInt();
		return validateInt(difficultyLevel, 1, 4, "Wprowadziles zla liczbe! Wpisz jeszcze raz!");
	}

	static void fillSudoku() {
		int z = 0;
		int x = 3;
		for (int i = 0; i < 9; i++) { // rzedy
			for (int j = 0; j < 3; j++) { // kolumny
				sudokuArray[i][j] = numbers.get(z);
				z = z + 1;

				if (i == 2 && j == 2) {
					z = 0;
					Collections.shuffle(numbers);
				}
				if (i == 5 && j == 2) {
					z = 0;
					Collections.shuffle(numbers);
				}
				if (i == 8 && j == 2) {
					z = 0;
					Collections.shuffle(numbers);

				}
			}
		}
		for (int i = 0; i < 9; i++) { // rzedy
			for (int j = 3; j < 6; j++) { // kolumny
				sudokuArray[i][j] = numbers.get(z);
				z = z + 1;
				if (i == 2 && j == 5) {
					z = 0;
					Collections.shuffle(numbers);
				}
				if (i == 5 && j == 5) {
					z = 0;
					Collections.shuffle(numbers);
				}
				if (i == 8 && j == 5) {
					z = 0;
					Collections.shuffle(numbers);
				}
			}
		}
		for (int i = 0; i < 9; i++) { // rzedy
			for (int j = 6; j < 9; j++) { // kolumny
				sudokuArray[i][j] = numbers.get(z);
				z = z + 1;
				if (i == 2 && j == 8) {
					z = 0;
					Collections.shuffle(numbers);
				}
				if (i == 5 && j == 8) {
					z = 0;
					Collections.shuffle(numbers);
				}
				if (i == 8 && j == 8) {
					z = 0;
					Collections.shuffle(numbers);
				}
			}
		}
	}

	static boolean ifContainsDuplicates() {
		int tempCheckArray[] = new int[9];
		int arrayProperSudokuNumbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int z = 0; z < 9; z++) {
			
			for (int i = 0; i < tempCheckArray.length; i++) {
				tempCheckArray[i] = sudokuArray[z][i];
				if (z==9){
					Arrays.sort(tempCheckArray);
					System.out.println(Arrays.toString(tempCheckArray));
					
					for (int j = 0; j < tempCheckArray.length; j++) {
			if (tempCheckArray[j] != arrayProperSudokuNumbers[j]) {
				duplicates = true;
				return duplicates;
			}
				}
			//	System.out.println(z + " " + i + " " + sudokuArray[i][z] + " " + tempCheckArray[i]);
		
			}
			
		}

		
		}
		duplicates = false;
		return duplicates;

	}

	static void drawSudoku() {
		for (int i = 0; i < 9; i++) {
			System.out.println(" ");
			for (int j = 0; j < 9; j++) {
				System.out.print(sudokuArray[i][j] + " ");
			}
		}
	}

	static int validateInt(int value, int min, int max, String errorMessage) {
		while (value < min || value > max) {
			System.out.println(errorMessage);
			value = getScanner().nextInt();
		}
		return value;
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		schuffleNumbers();

		while (duplicates == true) {

			fillSudoku();
			ifContainsDuplicates();
		}
		drawSudoku();

		System.out.println(duplicates);
	}

}
