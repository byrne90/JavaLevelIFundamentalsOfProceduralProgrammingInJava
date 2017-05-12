import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Zdefiniuj ilosc katow w wielokacie: ");
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();	
		ArrayList<Integer> list = new ArrayList<Integer>();	
		int angleCount = scan.nextInt();
		int random, sum = 0 ; 

		while (angleCount < 3) {
			System.out.println("Okresliles zbyt mala liczbe katow!!!");
			System.out.println("Podaj raz jeszcze liczbe katow: ");
			angleCount = scan.nextInt();
		}

		if (angleCount < 7) {
			for (int i = 0; i < angleCount; i++) {

				System.out.println("Wprowadz dlugosc boku nr " + (i + 1));
				int sideLenght = scan.nextInt();
				list.add(sideLenght);

			}
		} else {
			for (int i = 0; i < angleCount; i++) {
				random = generator.nextInt(12) + 1;
				list.add(random);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);			
		}
		System.out.println("Obwod wielokata o ilosci katow " + angleCount + " wynosi " + sum);
	}

}
