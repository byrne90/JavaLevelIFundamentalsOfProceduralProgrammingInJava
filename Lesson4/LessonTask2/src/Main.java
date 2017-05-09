import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bedziemy podnosic X do n-tej potegi");
		System.out.println("Podaj wartosc X:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println("Podaj wartosc n:");
		int n = input.nextInt();
		double power = Math.pow(x, n);
		int result = x;

		for (int i = 1; i < n; i++) {

			result = x * result;

		}
		
		
		System.out.println(result);
		System.out.println("Twoj wynik uzywajac biblioteki Math: "+power);
	}
}
