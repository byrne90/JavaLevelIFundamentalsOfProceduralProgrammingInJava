import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	

	static ArrayList<String> list;
	static int value;
	static int listSize;

	static ArrayList<String> createList() {
		System.out.println("Podaj pojemnosc tworzonej listy: ");
		listSize = getScanner().nextInt();
		return new ArrayList<String>(listSize); //lista size = 0, co zrobic?
		
	}

	static void fillUpList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Dodaj element nr " + (i + 1) + " listy.");
			list.add(getScanner().nextLine());
		}
	}

	static void deleteListElement() {
		System.out.println("Ktory element listy chcesz usunac?");
		int deleteIndicator = getScanner().nextInt();
		deleteIndicator = deleteIndicator - 1;
		list.remove(validateInt(deleteIndicator, 0, list.size(), "Wpisales zla cyfre!! Wpisz raz jeszcze."));
	}

	static void putNewElement() {
		System.out.println("Podaj miejsce listy w ktore chcesz wstawic nowy element:");
		int addNewElementIndicator = getScanner().nextInt();
		addNewElementIndicator = addNewElementIndicator - 1;
		// validateInt(addNewElementIndicator, 0, listSize-1 ,"Wpisales zly
		// numer! Podaj prawidlowy:");

		System.out.println("Podaj wartosc nowego elementu: ");
		String newElement = getScanner().nextLine();
		System.out.println(addNewElementIndicator + " " + listSize + " " + list.size() + " " + newElement);
		list.add(validateInt(addNewElementIndicator, 0, listSize, "Wpisales zly numer! Podaj prawidlowy:"), newElement);
	}

	static void setElement() {
		System.out.println("Podaj numer elementu ktory chcesz podmienic: ");
		int setIndicator = getScanner().nextInt();
		setIndicator = setIndicator - 1;
		if (setIndicator > list.size()) {
			System.out.println("Wpisales zly numer!");
			setElement();
		}
		System.out.println("Podaj nowa wartosc:");
		String setNewElement = getScanner().nextLine();
		list.set(setIndicator, setNewElement);
	}

	static void displayListSize() {
		System.out.println("Lista zawiera " + list.size() + " elementow.");
	}

	static void displayList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	static int validateInt(int value, int min, int max, String errorMessage) {
		while (value < min || value > max) {
			System.out.println(errorMessage);
			value = getScanner().nextInt();
			Main.value = 5;
		}
		return value;
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		list = createList();
		fillUpList();

		for (;;) {
			System.out.println("Wybierz czynnosc jaka chcesz wykonac WPISZ odpowiednia cyfre:");
			System.out.println("1. usuniecie wybranego elementu");
			System.out.println("2. wstawienie elementu w wybrane miejsce");
			System.out.println("3. podmien wartosc wybranego elementu");
			System.out.println("4. wyswietl aktualny rozmiar listy");
			System.out.println("5. wyswietl wszytskie elementy listy.");
			int userAction = getScanner().nextInt();

			switch (userAction) {
			case 1:
				if (list.size() == 0) {
					System.out.println("Lista jest pusta nie mozna usunac elemetnow!");
					break;
				}
				deleteListElement();
				break;
			case 2:
				putNewElement();
				break;
			case 3:
				setElement();
				break;
			case 4:
				displayListSize();
				break;
			case 5:
				displayList();
				break;
			default:
				System.out.println("Wpisales niewlasciwa cyfre!");
				break;
			}
		}
	}

}
