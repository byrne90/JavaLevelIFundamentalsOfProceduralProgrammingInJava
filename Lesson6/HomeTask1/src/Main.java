import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static ArrayList<String> itemList = new ArrayList<String>();
	static ArrayList<Integer> priceList = new ArrayList<Integer>();
	static int arrayLength;

	static void inputUserAction() {

		checkArrayLength();

		if (arrayLength > 10) {

			sumUpShoppingList();
		}

		System.out.println("Co zamierzasz zrobic? (wprowadz odpowiednia liczbe)");
		System.out.println("1. dodac artykul");
		System.out.println("2. usunac artykul");
		System.out.println("3. wyswietlic liste zakupow");
		System.out.println("4. podsumowanie zakupow.");

		int userAction = getScanner().nextInt();

		switch (userAction) {
		case 1:
			addItem();
			inputUserAction();
			break;
		case 2:
			removeItem();
			inputUserAction();
			break;
		case 3:
			displayPriceAndItemArray();
			inputUserAction();
			break;
		case 4:
			sumUpShoppingList();
			break;
		}
	}

	static void addItem() { 
		String item;
		System.out.println("Wprowadz nazwe art.");
		item = getScanner().nextLine();
		itemList.add(item);
		setRandomPrices();
	}

	static void removeItem() {
		System.out.println("Wprowadz liczbe art. ktory chcesz usunac:");
		int removeNumber = getScanner().nextInt();
		removeNumber = removeNumber - 1;
		itemList.remove(removeNumber);
		priceList.remove(removeNumber);
	}

	static int checkArrayLength() {
		arrayLength = itemList.size();
		return arrayLength;
	}

	static void displayItemsArray() {
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println((i + 1) + " " + itemList.get(i));
		}
	}

	static void displayPriceAndItemArray() {
		for (int i = 0; i < itemList.size(); i++) {
			System.out.print((i + 1) + " " + itemList.get(i));
			System.out.println(" " + priceList.get(i) + " PLN");
		}
	}

	static void setRandomPrices() {
		Random generator = new Random();

		for (int i = 0; i < arrayLength; i++) {
			priceList.add(generator.nextInt(25) + 1);
		}
	}

	static void sumUpShoppingList() {
		displayPriceAndItemArray();
		int shoppingSum = 0;
		for (int i = 0; i < arrayLength; i++) {
			shoppingSum = priceList.get(i) + shoppingSum;
		}
		System.out.println("Suma do zaplaty za zakupy to: " + shoppingSum+ " PLN.");
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		inputUserAction();
	}

}
