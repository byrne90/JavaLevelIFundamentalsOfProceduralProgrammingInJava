import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("PROGRAM DO OBLICZANIA POLA WYBRANEJ FIGURY \n");
		Scanner scan = new Scanner(System.in);
		final double PI = 3.14;

		System.out.println("Wybierz jedn� z podanych ni�ej figur: ");
		System.out.println("1. kwadrat,");
		System.out.println("2. ko�o,");
		System.out.println("3. prostok�t,");
		System.out.println("4. tr�jk�t.");
		System.out.println("Wprowad� numer odpowiadaj�cy wybranej figurze: ");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Wprowad� d�ugo�� boku kwadratu: ");
			int a = scan.nextInt();
			int square = a * a;
			System.out.println("D�ugo�� boku kwadratu wynosi: " + a + " pole figury jest r�wne: " + square);
			break;
		case 2:
			System.out.println("Wprowad� promie� ko�a: ");
			int r = scan.nextInt();
			double circle = PI * (Math.pow(r, 2));
			System.out.println("Promie� ko�a wynosi: " + r + " pole figury jest r�wne " + circle);
			break;
		case 3:
			System.out.println("Podaj d�ugo�� pierwszego boku prostok�tu: ");
			int b = scan.nextInt();
			System.out.println("Podaj d�ugo�� drugiego boku prostok�tu");
			int c = scan.nextInt();
			int rectangle = c * b;
			System.out.println("D�ugo�� pierwszego boku wynosi: " + b);
			System.out.println("D�ugo�� drugiego boku wynosi: " + c);
			System.out.println("Pole figury wynosi: " + rectangle);
			break;
		case 4:
			System.out.println("Podaj d�ugo�� podstawy tr�jk�ta: ");
			int d = scan.nextInt();
			System.out.println("Podaj wysoko�� tr�jk�ta: ");
			int h = scan.nextInt();
			double triangle = (0.5 * (d * h));
			System.out.println("D�ugo�� podstawy tr�jk�ta wynosi: " + d);
			System.out.println("Wysoko�� tr�jk�ta wynosi: " + h);
			System.out.println("Pole figury wybosi: " + triangle);
			break;
		default:
			System.out.println("Ups! Chyba wprowadzi�e� z�� liczb�. Uruchom program raz jeszcze!!!");
		}

	}

}
