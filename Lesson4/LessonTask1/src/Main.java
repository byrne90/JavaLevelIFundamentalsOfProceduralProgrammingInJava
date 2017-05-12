import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long n;
		long one = 0;
		long two = 1;
		System.out.println("Ktora liczbe ciagu Fibonacciego chcesz wyswietlic?");
		Scanner input = new Scanner(System.in);
		n = input.nextLong();

		if (n > 1) {
			System.out.println("Poprzednie wyrazenie to " + (one + two));
		}
		for (int i = 2; i < n; i++) {
			System.out.println("Poprzednie wyrazenie to " + (one + two));

			two = two + one;
			one = two - one;

		}
		System.out.println(one + two);

	}
}
