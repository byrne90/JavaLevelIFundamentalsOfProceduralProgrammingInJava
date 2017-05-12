import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Wybierz szkole do ktorej chodzisz: (wpisz liczbe)");
		System.out.println("1. podstawowa,");
		System.out.println("2. gimnazjum,");
		System.out.println("3. liceum,");
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		int school = scan.nextInt();

		double randomGrade = 1;
		boolean random;
		double sum = 0;

		switch (school) {
		case 1:
			double arrayPodst[] = new double[4];
			for (int i = 0; i < arrayPodst.length; i++) {
				random = generator.nextBoolean();
				randomGrade = generator.nextInt(6) + 1;
				if (randomGrade != 6 && random == true) {
					randomGrade = randomGrade + 0.5;
				}
				arrayPodst[i] = randomGrade;
				System.out.println("Twoje oceny to: " + arrayPodst[i] + ", ");
				sum = arrayPodst[i] + sum;
			}
			System.out.println("Srednia Twoich ocen to: " + (sum / arrayPodst.length));
			break;

		case 2:
			double arrayGimn[] = new double[6];
			for (int i = 0; i < arrayGimn.length; i++) {
				random = generator.nextBoolean();
				randomGrade = generator.nextInt(6) + 1;
				if (randomGrade != 6 && random == true) {
					randomGrade = randomGrade + 0.5;
				}
				arrayGimn[i] = randomGrade;
				System.out.println("Twoje oceny to: " + arrayGimn[i] + ", ");
				sum = arrayGimn[i] + sum;
			}
			System.out.println("Srednia Twoich ocen to: " + (sum / arrayGimn.length));
			break;
		case 3:
			double arrayLo[] = new double[8];
			for (int i = 0; i < arrayLo.length; i++) {
				random = generator.nextBoolean();
				randomGrade = generator.nextInt(6) + 1;
				if (randomGrade != 6 && random == true) {
					randomGrade = randomGrade + 0.5;
				}
				arrayLo[i] = randomGrade;
				System.out.println("Twoje oceny to: " + arrayLo[i] + ", ");
				sum = arrayLo[i] + sum;
			}
			System.out.println("Srednia Twoich ocen to: " + (sum / arrayLo.length));
			break;
		}
	}

}
