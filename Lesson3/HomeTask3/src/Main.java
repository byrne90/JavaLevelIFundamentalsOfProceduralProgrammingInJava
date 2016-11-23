import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("ODTWARZACZ MUZYCZNY \n");
		Scanner scan = new Scanner(System.in);

		System.out.println("Wybierz sw�j ulubiony gatunek muzyczny:"); // WYB�R
																		// GATUNKU
		System.out.println("1. rock,");
		System.out.println("2. jazz,");
		System.out.println("3. pop,");
		System.out.println("4. rnb,");
		System.out.println("Wprowadz odpowiedni� liczb�.");
		int favouriteMusic = scan.nextInt();

		System.out.println("Ustaw g�o�no�� muzyki: "); // G�O�NO��
		System.out.println("Wprowadz odpowiedni� liczb�.");
		System.out.println("1. g�o�no,");
		System.out.println("2. cicho.");
		int volumeLevel = scan.nextInt();

		System.out.println("Wybierz tony w jakich lubisz s�ucha� muzyk�: "); //TONACJA
		System.out.println("1. niskie. ");
		System.out.println("2. �rednie. ");
		System.out.println("3. wysokie. ");
		System.out.println("4. niskie i �rednie. ");
		System.out.println("5. niskie i wysokie. ");
		System.out.println("6. �rednie i wysokie. ");
		System.out.println("7. nieskie, �rednie i wysokie. ");
		System.out.println("Wprowad� odpowiedni� cyfr�: ");
		int tones = scan.nextInt();
		
		System.out.println("Ustaw balans g�o�nik�w.");
		System.out.println("0 \t 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10");
		System.out.println("g�o�nik lewy   \t \t \t    C E N T E R \t \t \t g�o�nik prawy");
		System.out.println("Wprowad� odpowiedni� cyfr� z tych podanych powy�ej: ");
		int balance = scan.nextInt();

		System.out.println("Tw�j ulubiony gatunek muzyczny to: ");
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
			System.out.println("Ups! Chyba wprowadzi�e� z�� liczb�. Odpal program raz jeszcze.");
		}

		System.out.println("Muzyka b�dzie odtwarzana: ");
		if (volumeLevel == 1) {
			System.out.println("g�o�no.");
		} else if (volumeLevel == 2) {
			System.out.println("cicho.");
		} else {
			System.out.println("Ups! Chyba wprowadzi�e� z�� liczb�. Odpal program raz jeszcze.");
		}

		System.out.println("Muzyka b�dzie odtwarzana w tonach:");
		switch (tones) {
		case 1:
			System.out.println("niskich.");
			break;
		case 2:
			System.out.println("�rednich.");
			break;
		case 3:
			System.out.println("wysokich.");
			break;
		case 4:
			System.out.println("niskich i �rednich.");
			break;
		case 5:
			System.out.println("niskich i wysokich.");
			break;
		case 6:
			System.out.println("�rednich i wysokich.");
			break;
		case 7:
			System.out.println("niskch, �rednich i wysokich.");
			break;
		default:
			System.out.println("Ups! Chyba wprowadzi�e� z�� liczb�. Odpal program raz jeszcze.");
		}

		System.out.println("G�o�no�� prawego g�o�nika to " + balance+".");
		System.out.println("G�o�no�� lewego g�o�nika to " + (10-balance)+".");
		if (balance<0){
			System.out.println("Ups! Chyba wprowadzi�e� z�� liczb�. Odpal program raz jeszcze.");
		} else if (balance>10){
			System.out.println("Ups! Chyba wprowadzi�e� z�� liczb�. Odpal program raz jeszcze.");
		}
	}

}
