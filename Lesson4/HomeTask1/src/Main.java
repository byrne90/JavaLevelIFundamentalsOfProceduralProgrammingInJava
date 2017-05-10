import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		char[] charArray = { 'M', 'A', 'R', 'E', 'K' };
		System.out.println(Arrays.toString(charArray));

		char first = 'J', third = 'N';

		charArray[0] = first;
		charArray[2] = third;
		System.out.println(Arrays.toString(charArray));

	}

}
