import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static Random random = new Random();

	static int angleCount;
	static int sideLength;
	static int sum;

	static int inputAngleCount() {
		System.out.println("Wprowadz ilosc katow:");
		angleCount = scan.nextInt();

		while (angleCount < 3) {
			System.out.println("Wprowadziles zbyt mala ilosc katow!");
			System.out.println("Wprowadz POPRAWNA ilosc katow:");
			angleCount = scan.nextInt();
		}

		return angleCount;
	}

	static void inputSideLength() {
		if (angleCount < 7) {
			for (int i = 0; i < angleCount; i++) {
				System.out.println("Wprowadz dlugosc " + (i + 1) + " boku.");
				sideLength = scan.nextInt();
				list.add(sideLength);
			}

		} else {
			for (int i = 0; i < angleCount; i++) {
				sideLength = random.nextInt(12) + 1;
				list.add(sideLength);
			}
		}
	}

	static int getSum() {
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {

		inputAngleCount();
		inputSideLength();
		getSum();

		System.out.println("Obwod wielokata o " + angleCount + " katach, wynosi: " + sum);

	}

}
