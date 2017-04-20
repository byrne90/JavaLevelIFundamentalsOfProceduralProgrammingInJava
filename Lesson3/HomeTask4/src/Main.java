import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("PROGRAM DO OBLICZANIA POLA WYBRANEJ FIGURY \n");
		Scanner scan = new Scanner(System.in);
		final double PI = 3.14;

		System.out.println("Wybierz jedn¹ z podanych ni¿ej figur: ");
		System.out.println("1. kwadrat,");
		System.out.println("2. ko³o,");
		System.out.println("3. prostok¹t,");
		System.out.println("4. trójk¹t.");
		System.out.println("Wprowad¿ numer odpowiadaj¹cy wybranej figurze: ");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("WprowadŸ d³ugoœæ boku kwadratu: ");
			int a = scan.nextInt();
			int square = a * a;
			System.out.println("D³ugoœæ boku kwadratu wynosi: " + a + " pole figury jest równe: " + square);
			break;
		case 2:
			System.out.println("WprowadŸ promieñ ko³a: ");
			int r = scan.nextInt();
			double circle = PI * (Math.pow(r, 2));
			System.out.println("Promieñ ko³a wynosi: " + r + " pole figury jest równe " + circle);
			break;
		case 3:
			System.out.println("Podaj d³ugoœæ pierwszego boku prostok¹tu: ");
			int b = scan.nextInt();
			System.out.println("Podaj d³ugoœæ drugiego boku prostok¹tu");
			int c = scan.nextInt();
			int rectangle = c * b;
			System.out.println("D³ugoœæ pierwszego boku wynosi: " + b);
			System.out.println("D³ugoœæ drugiego boku wynosi: " + c);
			System.out.println("Pole figury wynosi: " + rectangle);
			break;
		case 4:
			System.out.println("Podaj d³ugoœæ podstawy trójk¹ta: ");
			int d = scan.nextInt();
			System.out.println("Podaj wysokoœæ trójk¹ta: ");
			int h = scan.nextInt();
			double triangle = (0.5 * (d * h));
			System.out.println("D³ugoœæ podstawy trójk¹ta wynosi: " + d);
			System.out.println("Wysokoœæ trójk¹ta wynosi: " + h);
			System.out.println("Pole figury wybosi: " + triangle);
			break;
		default:
			System.out.println("Ups! Chyba wprowadzi³eœ z³¹ liczbê. Uruchom program raz jeszcze!!!");
		}

	}

}
