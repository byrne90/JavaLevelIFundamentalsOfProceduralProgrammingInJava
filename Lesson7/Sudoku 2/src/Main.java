import java.util.Random;

public class Main {

	static char sudokuBoard[][] = new char[9][9];
	static char numbers[] = "123456789".toCharArray();
	static Random random = new Random();

	static void preparingSudokuBoardHashMehod() {
		for (int i = 0; i < sudokuBoard.length; i++) {
			for (int j = 0; j < sudokuBoard.length; j++) {
				sudokuBoard[i][j] = '#';
			}
		}
	}

	static void drawSudokuBoard() {
		for (int i = 0; i < sudokuBoard.length; i++) {
			for (int j = 0; j < sudokuBoard.length; j++) {
				System.out.print(sudokuBoard[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void generateSudokuBoards(int numberOfRandomElements) {
		int x;
		int y;
		char randomNumber;
		while (numberOfRandomElements != 0) {

			x = random.nextInt(sudokuBoard.length);
			y = random.nextInt(sudokuBoard.length);
			randomNumber = numbers[random.nextInt(numbers.length)];

			if (sudokuBoard[x][y] == '#') {
				if (checkDuplicatesRow(x, randomNumber)) {
					if (checkDupliactesColumn(y, randomNumber)) {
						if (checkDuplicatesSquare(x, y, randomNumber))
							sudokuBoard[x][y] = randomNumber;
						numberOfRandomElements--;
					}
				}
			}
		}
	}

	static boolean checkDuplicatesRow(int row, int random) {
		for (int i = 0; i < sudokuBoard.length; i++) {
			if (sudokuBoard[row][i] == random) {
				return false;
			}
		}
		return true;
	}

	static boolean checkDupliactesColumn(int column, int random) {
		for (int i = 0; i < sudokuBoard.length; i++) {
			if (sudokuBoard[i][column] == random) {
				return false;
			}
		}
		return true;
	}

	static boolean checkDuplicatesSquare(int column, int row, int random) { // jak
																			// sprawdzic
																			// dlaczego
																			// nie
																			// wykonuje
																			// tego
																			// checka!!!!!!
		int xSquare = 0;
		int ySqaure = 0;
		int a = 0;
		int b = 0;

		if (column < 3) {
			ySqaure = 2;
			a = 0;
		}
		if (column < 6 && column > 3) {
			ySqaure = 5;
			a = 3;
		}
		if (column < 9 && column > 6) {
			ySqaure = 8;
			a = 6;
		}

		if (row < 3) {
			xSquare = 2;
			b = 0;
		}
		if (row < 6 && row > 3) {
			xSquare = 5;
			b = 3;
		}
		if (row < 9 && row > 6) {
			xSquare = 8;
			b = 6;
		}

		for (int i = b; b < ySqaure; i++) {
			for (int j = a; a < xSquare; j++) {
				if (sudokuBoard[i][j] == random) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		preparingSudokuBoardHashMehod();
		generateSudokuBoards(30);
		drawSudokuBoard();
	}

}
