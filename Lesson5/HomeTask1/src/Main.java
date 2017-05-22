import java.util.Scanner;

public class Main {

	// TODO do poprawy nazwy funkcji wlasnych, zastosowac funkcje get.Scan().
	// validaty zastosowac

	static String name;
	static String surname;
	static String schoolName;
	static int schoolLevel;
	static int classNumber;
	static String profile;
	static String extraClass;
	static int yesNo;
	public static Scanner scanner = new Scanner(System.in);

	static String inputName() {
		System.out.println("Wprowadz imie ucznia: ");
		name = getScanner().nextLine();
		return name;
	}

	static String inputSurname() {
		System.out.println("Wprowadz nazwisko ucznia: ");
		surname = getScanner().nextLine();
		return surname;
	}

	static String inputSchoolName() {
		System.out.println("Wprowadz nazwe szkoly: ");
		schoolName = getScanner().nextLine();
		return schoolName;
	}

	static int selectSchoolLevel() {
		System.out.println("Wprowadz liczbe wlasciwa dla szkoly: ");
		System.out.println("1.szkola podstawowa, ");
		System.out.println("2. szkola gimnazjalna.");
		schoolLevel = getScanner().nextInt();

		return validateInt(schoolLevel, 1, 2, "Error zla liczba", "Wprowadz raz jeszcze!");
	}

	static int selectClassNumber() {
		if (schoolLevel == 1) {
			System.out.println("Wprowadz numer klasy od 1-6");
			classNumber = getScanner().nextByte();
			validateInt(classNumber, 1, 6, "Wprowadziles zly numer klasy", "Wprowadz numer klasy od 1-6");
		}
		if (schoolLevel == 2) {
			System.out.println("Wprowadz numer klasy od 1-3");
			classNumber = getScanner().nextByte();
			validateInt(classNumber, 1, 3, "Wprowadziles zly numer klasy", "Wprowadz numer klasy od 1-3");
		}
		return classNumber;
	}

	static String inputClassProfile() {
		System.out.println("Wpisz profil klasy: ");
		profile = getScanner().nextLine();
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

	static String inputExtraClass() {
		System.out.println("Czy chcesz dopisac dodatkowe kolko?");
		System.out.println("1. TAK");
		System.out.println("2. NIE");
		System.out.println("Wprowadz odpowiednia cyfre.");
		yesNo = getScanner().nextInt();
		validateInt(yesNo, 1, 2, "Wprowadziles ZLA cyfre.", "Wprowadz ponownie!");
		if (yesNo == 1) { // z metody velidate nie przekazywalo value wiec
							// nastapila korekta w metodzie!
			System.out.println("Wprowadz nazwe kolka na ktore uczeszcza uczen: ");
			extraClass = getScanner().nextLine();
		}
		return extraClass;
	}

	static void getSubjectList() {
		if (schoolLevel == 1) {
			System.out.println("Lista przedmiotow ucznia:");
			System.out.println("WF, j. polski, matematyka");
		} else {
			System.out.println("Lista przedmiotow ucznia:");
			System.out.println("WF, j. polski, matematyka, fizyka, chemia");

		}
	}

	static int validateInt(int value, int min, int max, String errorMessage, String communicate) {
		while (value < min || value > max) {
			System.out.println(errorMessage);
			System.out.println(communicate);
			value = getScanner().nextInt();
			yesNo = value; // dopisana deklaracja zmiennej bo nie przekazywalo
							// value z metody
		}
		return value;
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

	public static void main(String[] args) {
		inputName();
		inputSurname();
		inputSchoolName();
		selectSchoolLevel();
		selectClassNumber();
		inputClassProfile();

		displayData();
		getSubjectList();

		inputExtraClass();

		displayData();
		getSubjectList();
	}

}
