import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Zdefiniuj ilosc katow w wielokacie: ");
		Scanner scan = new Scanner(System.in);
		int angleCount = scan.nextInt();
		int random, lenght = 1, sum = 1; // dlaczego musialem zadeklarowac
											// wartosci lenght i sum?

		while (angleCount < 3) {
			System.out.println("Okresliles zbyt mala liczbe katow!!!");
			System.out.println("Podaj raz jeszcze liczbe katow: ");
			angleCount = scan.nextInt();
			continue;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		if (angleCount < 7) {
			for (int i = 0; i < angleCount; i++) {

				System.out.println("Wprowadz dlugosc boku nr " + (i + 1));
				int sideLenght = scan.nextInt();
				list.add(sideLenght);

			}
		} else {
			for (int i = 0; i < angleCount; i++) {
				Random generator = new Random();
				random = generator.nextInt(11 + 1);
				list.add(random);
			}
		}
		for (int i = 1; i < list.size(); i++) {
			lenght = list.get(i);
			sum = lenght + sum;
		}
		System.out.println("Obwod wielokata o ilosci katow " + angleCount + " wynosi " + sum);
	}

}
