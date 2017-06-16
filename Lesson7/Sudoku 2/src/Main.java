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
				if (checkDuplicatesRow(x, randomNumber) && checkDupliactesColumn(y, randomNumber)
						&& checkDuplicatesSquare(x, y, randomNumber)) {

					sudokuBoard[x][y] = randomNumber;
					numberOfRandomElements--;
				}
			}
		}
	}

	static boolean checkDuplicatesRow(int row, char random) {
		for (int i = 0; i < sudokuBoard.length; i++) {
			if (sudokuBoard[row][i] == random) {
				return false;
			}
		}
		return true;
	}

	static boolean checkDupliactesColumn(int column, char random) {
		for (int i = 0; i < sudokuBoard.length; i++) {
			if (sudokuBoard[i][column] == random) {
				return false;
			}
		}
		return true;
	}

	static boolean checkDuplicatesSquare(int row, int column, char random) {
		row = (row / 3) * 3;
		column = (column / 3) * 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (sudokuBoard[row + i][column + j] == random) {
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
