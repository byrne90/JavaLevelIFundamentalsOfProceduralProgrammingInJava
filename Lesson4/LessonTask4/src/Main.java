import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Podaj liczbe nr. " + (i + 1));
			Scanner scan = new Scanner(System.in);
			int userNumber = scan.nextInt();
			array[i] = userNumber;
		}
		System.out.println("Liczby w odwrotnej kolejnosci: ");
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");

	}

}
