import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("ODTWARZACZ MUZYCZNY \n");
		Scanner scan = new Scanner(System.in);

		System.out.println("Wybierz swój ulubiony gatunek muzyczny:"); // WYBÓR
																		// GATUNKU
		System.out.println("1. rock,");
		System.out.println("2. jazz,");
		System.out.println("3. pop,");
		System.out.println("4. rnb,");
		System.out.println("Wprowadz odpowiedni¹ liczbê.");
		int favouriteMusic = scan.nextInt();

		System.out.println("Ustaw g³oœnoœæ muzyki: "); // G£OŒNOŒÆ
		System.out.println("Wprowadz odpowiedni¹ liczbê.");
		System.out.println("1. g³oœno,");
		System.out.println("2. cicho.");
		int volumeLevel = scan.nextInt();

		System.out.println("Wybierz tony w jakich lubisz s³uchaæ muzykê: "); //TONACJA
		System.out.println("1. niskie. ");
		System.out.println("2. œrednie. ");
		System.out.println("3. wysokie. ");
		System.out.println("4. niskie i œrednie. ");
		System.out.println("5. niskie i wysokie. ");
		System.out.println("6. œrednie i wysokie. ");
		System.out.println("7. nieskie, œrednie i wysokie. ");
		System.out.println("Wprowad¿ odpowiedni¹ cyfrê: ");
		int tones = scan.nextInt();
		
		System.out.println("Ustaw balans g³oœników.");
		System.out.println("0 \t 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10");
		System.out.println("g³oœnik lewy   \t \t \t    C E N T E R \t \t \t g³oœnik prawy");
		System.out.println("WprowadŸ odpowiedni¹ cyfrê z tych podanych powy¿ej: ");
		int balance = scan.nextInt();

		System.out.println("Twój ulubiony gatunek muzyczny to: ");
		switch (favouriteMusic) {
		case 1:
			System.out.println("rock.");
			break;
		case 2:
			System.out.println("jazz.");
			break;
		case 3:
			System.out.println("pop.");
			break;
		case 4:
			System.out.println("rnb.");
			break;
		default:
			System.out.println("Ups! Chyba wprowadzi³eœ z³¹ liczbê. Odpal program raz jeszcze.");
		}

		System.out.println("Muzyka bêdzie odtwarzana: ");
		if (volumeLevel == 1) {
			System.out.println("g³oœno.");
		} else if (volumeLevel == 2) {
			System.out.println("cicho.");
		} else {
			System.out.println("Ups! Chyba wprowadzi³eœ z³¹ liczbê. Odpal program raz jeszcze.");
		}

		System.out.println("Muzyka bêdzie odtwarzana w tonach:");
		switch (tones) {
		case 1:
			System.out.println("niskich.");
			break;
		case 2:
			System.out.println("œrednich.");
			break;
		case 3:
			System.out.println("wysokich.");
			break;
		case 4:
			System.out.println("niskich i œrednich.");
			break;
		case 5:
			System.out.println("niskich i wysokich.");
			break;
		case 6:
			System.out.println("œrednich i wysokich.");
			break;
		case 7:
			System.out.println("niskch, œrednich i wysokich.");
			break;
		default:
			System.out.println("Ups! Chyba wprowadzi³eœ z³¹ liczbê. Odpal program raz jeszcze.");
		}

		System.out.println("G³oœnoœæ prawego g³oœnika to " + balance+".");
		System.out.println("G³oœnoœæ lewego g³oœnika to " + (10-balance)+".");
		if (balance<0){
			System.out.println("Ups! Chyba wprowadzi³eœ z³¹ liczbê. Odpal program raz jeszcze.");
		} else if (balance>10){
			System.out.println("Ups! Chyba wprowadzi³eœ z³¹ liczbê. Odpal program raz jeszcze.");
		}
	}

}
