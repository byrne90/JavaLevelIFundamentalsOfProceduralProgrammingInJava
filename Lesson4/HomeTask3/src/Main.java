import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Wybierz szkole do ktorej chodzisz: (wpisz liczbe)");
		System.out.println("1. podstawowa,");
		System.out.println("2. gimnazjum,");
		System.out.println("3. liceum,");

		Scanner scan = new Scanner(System.in);
		int school = scan.nextInt();

		switch (school) {
		case 1:
			double arrayPodstawowka[] = new double[5];
			double randomPodstawowka = 1;
			double sumPodstawowka = 0;
			for (int i = 0; i < arrayPodstawowka.length; i++) {
				Random generator = new Random();
				randomPodstawowka = generator.nextInt(12) + 1;
				randomPodstawowka = randomPodstawowka * 0.5;
				arrayPodstawowka[i] = randomPodstawowka;
			}
			for (int i = 1; i < arrayPodstawowka.length; i++) {
				System.out.println("Twoje oceny to: " + arrayPodstawowka[i] + ", ");
			}
			for (int i = 0; i < arrayPodstawowka.length; i++) {
				sumPodstawowka = arrayPodstawowka[i] + sumPodstawowka;
			}
			System.out.println("Srednia Twoich ocen to: " + (sumPodstawowka / 4));
			break;
		case 2:
			double arrayGim[] = new double[7];
			double randomGim = 1;
			double sumGim = 0;
			for (int i = 0; i < arrayGim.length; i++) {
				Random generator = new Random();
				randomGim = generator.nextInt(12) + 1;
				randomGim = randomGim * 0.5;
				arrayGim[i] = randomGim;
			}
			for (int i = 1; i < arrayGim.length; i++) {
				System.out.println("Twoje oceny to: " + arrayGim[i] + ", ");
			}
			for (int i = 0; i < arrayGim.length; i++) {
				sumGim = arrayGim[i] + sumGim;
			}
			System.out.println("Srednia Twoich ocen to: " + (sumGim / 6));
			break;
		case 3:
			double arrayLo[] = new double[8];
			double randomLo = 1;
			double sumLo = 0;
			for (int i = 0; i < arrayLo.length; i++) {
				Random generator = new Random();
				randomLo = generator.nextInt(12) + 1;
				randomLo = randomLo * 0.5;
				arrayLo[i] = randomLo;
			}
			for (int i = 1; i < arrayLo.length; i++) {
				System.out.println("Twoje oceny to: " + arrayLo[i] + ", ");
			}
			for (int i = 0; i < arrayLo.length; i++) {
				sumLo = arrayLo[i] + sumLo;
			}
			System.out.println("Srednia Twoich ocen to: " + (sumLo / 7));
			break;
		}
	}

}
