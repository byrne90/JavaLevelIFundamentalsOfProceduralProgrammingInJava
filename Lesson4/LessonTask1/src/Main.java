import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long n, one = 0, two = 1;
		System.out.println("Ktora liczbe ciagu Fibonacciego chcesz wyswietlic?");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		n = Integer.parseInt(text); // czemu nie mozna int n wykorzystac
									// bezposrednio jako int tylko trzeba robic
									// konwersje
		for (int i = 2; i < n; i++) {

			two = two + one;
			one = two - one;

		}
		System.out.println(one + two + ",");
		System.out.println("Kolejne liczby ciagu to:");

		for (int i = 0; i < n; i++) { // jesli chcemy nieskonczonosc stosujemy
										// dekrementacje 
										//na ta chwile wyswietalmy n elementow
			two = two + one;
			one = two - one;
			System.out.println(one + two);
		}
	}
}
