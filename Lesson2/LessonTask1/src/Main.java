import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String namePlayer; 
		int age;
		float height;
		String clubName;
		int numberOnShirt;
		boolean isRightFooted;
		int numberRedCards;
		
		namePlayer = "Roberto Carlos";
		age = 33;
		height = 1.83f;
		clubName = "Juventus";
		numberOnShirt = 44;
		isRightFooted = false;
		numberRedCards = 1;
		
		System.out.println("Wpisz pseudonim zawodnika: ");
		String nickname;
		Scanner scaner = new Scanner(System.in);
		nickname=scaner.nextLine();
		
		System.out.println("Nazwa pilkarza "+namePlayer);
		System.out.println("Wiek pilkarza "+age);
		System.out.println("Wzrost pilkarza "+height);
		System.out.println("Zespol pilkarza "+clubName);
		System.out.println("Numer pilkarza "+numberOnShirt);
		System.out.println("Czy jest prawonozny "+isRightFooted);
		System.out.println("Ilosc czerwonych kartek pilkarza "+numberRedCards);
		System.out.println("Pseudonim pilkarza "+nickname);
		
	}

}
