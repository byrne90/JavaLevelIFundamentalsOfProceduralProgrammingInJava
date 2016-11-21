import com.sun.scenario.effect.Blend;

public class Main {

	public static void main(String[] args) {
		int redBalls, blueBalls, greenBalls;
		redBalls = 2;
		blueBalls = 3;
		greenBalls = 6;

		System.out.println("Ilosc czerwonych kulek: " + redBalls);
		System.out.println("Ilosc niebieskich kulek: " + blueBalls);
		System.out.println("Ilosc zielonych kulek:  " + greenBalls);
		System.out.println("Laczna liczba kulek to: " + (redBalls + blueBalls + greenBalls));

		int allBallsTogether = redBalls + greenBalls + blueBalls;
		int blackBalls = 8;
		allBallsTogether = allBallsTogether + blackBalls;

		System.out.println("Laczna liczba kulek: " + allBallsTogether);

		redBalls = 11;

		System.out.println("Laczna liczba kulek: " + allBallsTogether);

	}

}
