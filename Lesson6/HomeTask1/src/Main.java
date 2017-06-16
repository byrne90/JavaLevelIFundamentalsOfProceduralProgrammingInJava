import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static ArrayList<String> itemList = new ArrayList<String>();
	static ArrayList<Integer> priceList = new ArrayList<Integer>();
	static int arrayLength;
	static int userAction;
	static int validatedInt;

	static void addItem() {
		String item;
		System.out.println("Wprowadz nazwe art.");
		item = getScanner().nextLine();
		itemList.add(item);
		setRandomPrices();
	}

	static void removeItem() {
		System.out.println("Wprowadz numer art. ktory chcesz usunac:");
		int removeNumber = getScanner().nextInt();
		removeNumber = removeNumber - 1;
		validateInt(removeNumber, 0, itemList.size(), "Wpisales zla wartosc elementu!");
		itemList.remove(validatedInt);
		priceList.remove(validatedInt);
	}

	static void displayPriceAndItemArray() {
		for (int i = 0; i < itemList.size(); i++) {
			System.out.print((i + 1) + " " + itemList.get(i));
			System.out.println(" " + priceList.get(i) + " PLN");
		}
	}

	static void displayItemList() {
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println((i + 1) + " " + itemList.get(i));
		}
	}

	static void setRandomPrices() {
		Random generator = new Random();

		for (int i = 0; i < itemList.size(); i++) {
			priceList.add(generator.nextInt(25) + 1);
		}
	}

	static void sumUpShoppingList() {
		int shoppingSum = 0;
		for (int i = 0; i < itemList.size(); i++) {
			shoppingSum = priceList.get(i) + shoppingSum;
		}
		System.out.println("Suma do zaplaty za zakupy to: " + shoppingSum + " PLN.");
	}

	static boolean isFullList(ArrayList<String> list, int max) {
		if (list.size() <= max) {
			return false;
		}
		return true;
	}

	static int validateInt(int value, int min, int max, String errorMessage) {
		while (value < min || value > max) {
			System.out.println(errorMessage);
			value = getScanner().nextInt();
			validatedInt = value - 1;
		}
		return validatedInt;
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		for (;;) {

			if (isFullList(itemList, 9) == true) {
				displayPriceAndItemArray();
				sumUpShoppingList();
			}

			System.out.println("Co zamierzasz zrobic? (wprowadz odpowiednia liczbe)");
			System.out.println("1. dodac artykul");
			System.out.println("2. usunac artykul");
			System.out.println("3. wyswietlic liste zakupow");
			System.out.println("4. podsumowanie zakupow.");

			userAction = getScanner().nextInt();

			switch (userAction) {
			case 1:
				addItem();
				break;
			case 2:
				if (itemList.size() == 0) {
					break;
				}
				removeItem();
				break;
			case 3:
				displayItemList();
				break;
			case 4:
				displayPriceAndItemArray();
				sumUpShoppingList();
				break;
			}
		}
	}

}
