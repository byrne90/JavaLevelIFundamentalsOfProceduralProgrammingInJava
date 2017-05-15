import java.util.Scanner;

public class Main {
	static String name; // czemu musimy uzyc static????
	static String surname;
	static String schoolName;
	static byte schoolLevel;
	static byte classNumber;
	static String profile;
	static String extraClass;
	static Scanner scan = new Scanner(System.in);

	static String name() {
		System.out.println("Wprowadz imie ucznia: ");
		name = scan.nextLine();
		return name;
	}

	static String surname() {
		System.out.println("Wprowadz nazwisko ucznia: ");
		surname = scan.nextLine();
		return surname;
	}

	static String schoolName() {
		System.out.println("Wprowadz nazwe szkoly: ");
		schoolName = scan.nextLine();
		return schoolName;
	}

	static byte schoolLevel() {
		System.out.println("Wprowadz liczbe wlasciwa dla szkoly: ");
		System.out.println("1.szkola podstawowa, ");
		System.out.println("2. szkola gimnazjalna.");
		schoolLevel = scan.nextByte();

		while (schoolLevel < 0 || schoolLevel > 2) {
			System.out.println("Wprowadziles niewlasciwa liczbe!");
			System.out.println("Wprowadz  POPRAWNA liczbe wlasciwa dla szkoly: ");
			System.out.println("1.szkola podstawowa, ");
			System.out.println("2. szkola gimnazjalna.");
			schoolLevel = scan.nextByte();
			if (schoolLevel == 1 || schoolLevel == 2) {
				break;
			}
		}

		return schoolLevel;
	}

	static byte classNumber() {
		if (schoolLevel == 1) {
			System.out.println("Wprowadz numer klasy od 1-6");
			classNumber = scan.nextByte();
			scan.nextLine(); // czemu musialem uzyc nextLine? nie czekalo na
								// pobranie nastepnej waetosci String (nextLine)
			while (classNumber < 0 || classNumber > 6) {
				System.out.println("Wprowadziles niewlasciwy numer klasy!");
				System.out.println("Wprowadz POPRAWNY numer klasy od 1-6");
				classNumber = scan.nextByte();
				scan.nextLine(); // czemu musialem uzyc nextLine? nie czekalo na
									// pobranie nastepnej waetosci String
									// (nextLine)
				if (classNumber > 0 && classNumber < 7) {
					break;
				}
			}
		}
		if (schoolLevel == 2) {
			System.out.println("Wprowadz numer klasy od 1-3");
			classNumber = scan.nextByte();
			scan.nextLine(); // czemu musialem uzyc nextLine? nie czekalo na
								// pobranie nastepnej waetosci String (nextLine)
			while (classNumber < 0 || classNumber > 3) {
				System.out.println("Wprowadziles niewlasciwy numer klasy!");
				System.out.println("Wprowadz POPRAWNY numer klasy od 1-3");
				classNumber = scan.nextByte();
				scan.nextLine(); // czemu musialem uzyc nextLine? nie czekalo na
									// pobranie nastepnej waetosci String
									// (nextLine)
				if (classNumber > 0 && classNumber < 4) {
					break;
				}
			}
		}
		return classNumber;
	}

	static String profile() {
		System.out.println("Wpisz profil klasy: ");
		profile = scan.nextLine();
		return profile;
	}

	static void displayData() {
		System.out.println("Imie: " + name);
		System.out.println("Nazwisko: " + surname);
		System.out.println("Nazwa szkoly: " + schoolName);
		System.out.println("Szkola " + schoolLevel);
		System.out.println("Numer klasy: " + classNumber);
		System.out.println("Profil: " + profile);
		if (extraClass != null) {
			System.out.println("Dodatkowe kolka: " + extraClass);
		}
	}

	static String extraClass() {
		int yesNo;
		System.out.println("Czy chcesz dopisac dodatkowe kolko?");
		System.out.println("1. TAK");
		System.out.println("2. NIE");
		System.out.println("Wprowadz odpowiednia cyfre.");
		yesNo = scan.nextInt();
		scan.nextLine(); // czemu musialem uzyc nextLine? nie czekalo na
							// pobranie nastepnej waetosci String (nextLine)
		while (yesNo < 0 || yesNo > 2) {
			System.out.println("Wprowadziles niewlasciwa cyfre!");
			System.out.println("Wpisz ja tym razem POPRAWNIE!");
			System.out.println("Czy chcesz dopisac dodatkowe kolko?");
			System.out.println("1. TAK");
			System.out.println("2. NIE");
			System.out.println("Wprowadz odpowiednia cyfre.");
			yesNo = scan.nextInt();
			scan.nextLine(); // czemu musialem uzyc nextLine? nie czekalo na
			// pobranie nastepnej waetosci String (nextLine)
			if (yesNo > 0 && yesNo < 2) {
				break;
			}
		}
		if (yesNo == 1) {
			System.out.println("Wprowadz nazwe kolka na ktore uczeszcza uczen: ");
			extraClass = scan.nextLine();
		}
		return extraClass;
	}

	static void subjectList() {
		if (schoolLevel == 1) {
			System.out.println("Lista przedmiotow ucznia:");
			System.out.println("WF, j. polski, matematyka");
		} else {
			System.out.println("Lista przedmiotow ucznia:");
			System.out.println("WF, j. polski, matematyka, fizyka, chemia");

		}
	}

	public static void main(String[] args) {
		name();
		surname();
		schoolName();
		schoolLevel();
		classNumber();
		profile();

		displayData();
		subjectList();

		extraClass();

		displayData();
		subjectList();
	}

}
