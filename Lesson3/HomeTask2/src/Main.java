import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("DZIENNICZEK UCZNIA \n");

		System.out.println("Wprowadz nast�puj�ce dane ucznia:");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Podaj imie ucznia:");
		String name = scan.nextLine();
		
		System.out.println("Podaj nazwisko ucznia:");
		String surname = scan.nextLine();
		
		System.out.println("Podaj nazwe szkoly:");
		String schoolName= scan.nextLine();
		
		System.out.println("Wybierz poziom nauki:");
		int a; //poziom nauki
		System.out.println("Wprowad� 1 - szko�a podstawowa.");
		System.out.println("Wprowad� 2 - szko�a gimnazjalna.");
		a=scan.nextInt();
		
			System.out.println("Wybierz klas�:");
		int b; //klasa
		if (a==1){
			System.out.println("Wybrale� szko�� podstawow�.");
			System.out.println("Podaj numer klasy od 1-6.");
			b=scan.nextInt();
		} 
		else {
			System.out.println("Wybra�e� szko�� gimnazjaln�.");
			System.out.println("Wybierz numer klasy od 1-3.");
			b=scan.nextInt();
		}
		
		System.out.println("Wybierz profil klasy podaj�c odpowiedni numer porz�dkowy: ");
		System.out.println("1. matematyczna,");
		System.out.println("2. biologiczna,");
		System.out.println("3. og�lna.");
		int c; //profil klasy
		c=scan.nextInt();
		
		System.out.println("Dane ucznia: ");
		System.out.println("Imie i nazwisko: " +name+" "+surname);
		System.out.println("Szko�a do kt�rej ucz�szcza: "+schoolName);
		System.out.print("Poziom nauki:");
		if (a==1){
			System.out.println("szko�a podstawowa.");
		} else {
			System.out.println("szko�a gimnazjalna.");
		}
		System.out.println("Klasa do kt�rej ucz�szcza: "+b+".");
		System.out.print("Profil klasy: ");
		switch (c){
		case 1:
			System.out.println("matematyczny.");
			break;
		case 2:
			System.out.println("biologiczny");
			break;
		case 3:
			System.out.println("og�lny.");
			break;
			default:
				System.out.println("WPROWADZONO NIEWLASCIWY PROFIL!!!");
		}
		System.out.println("Przedmioty na kt�re ucze� ucz�szcza: ");
		if (a==1){
			System.out.println("WF, j�zyk polski, matematyka.");
		} else {
			System.out.println("WF, j�zyk polski, matematyka, fizyka, chemia.");
		}
		
		System.out.println("Czy chcesz dopisa� zaj�cia dodatkowe na kt�re ucze� ucz�szcza?");
		System.out.println("TAK - wprowad� 1.");
		System.out.println("NIE - wprowad� 2.");
		
		/*int d; //dodatkowe zaj�cia
		d=scan.nextInt();
		String extraClass; //NIE DZIALA!! scan z warunku nie inicjalizuje Stringu!
		if (d==1){
			System.out.println("Podaj nazwy dodatkowych zaj��:");
			Scanner scan2 =new Scanner (System.in);
			extraClass=scan2.nextLine();
			
		} 
		else {
			System.out.println("Ucze� nie ucz�szcza na dodatkowe zaj�cia.");
		}
		System.out.println(extraClass);
		*/
		
		int e=scan.nextInt();
		if (e==1){
			System.out.println("Podaj nazwy dodatkowych zaj��: ");
			Scanner scan2 =new Scanner (System.in);
			String extraClass=scan2.nextLine();
			System.out.println("Dane ucznia: ");
			System.out.println("Imie i nazwisko: " +name+" "+surname);
			System.out.println("Szko�a do kt�rej ucz�szcza: "+schoolName);
			System.out.print("Poziom nauki:");
			if (a==1){
				System.out.println("szko�a podstawowa.");
			} else {
				System.out.println("szko�a gimnazjalna.");
			}
			System.out.println("Klasa do kt�rej ucz�szcza: "+b+".");
			System.out.print("Profil klasy: ");
			switch (c){
			case 1:
				System.out.println("matematyczny.");
				break;
			case 2:
				System.out.println("biologiczny");
				break;
			case 3:
				System.out.println("og�lny.");
				break;
				default:
					System.out.println("WPROWADZONO NIEWLASCIWY PROFIL!!!");
			}
			System.out.println("Przedmioty na kt�re ucze� ucz�szcza: ");
			if (a==1){
				System.out.println("WF, j�zyk polski, matematyka.");
			} else {
				System.out.println("WF, j�zyk polski, matematyka, fizyka, chemia.");
			}
			System.out.println("Dodatkowe zaj�cia na kt�re ucze� ucz�szcza: \n"+extraClass);
		}else {
			System.out.println("Dane ucznia: ");
			System.out.println("Imie i nazwisko: " +name+" "+surname);
			System.out.println("Szko�a do kt�rej ucz�szcza: "+schoolName);
			System.out.print("Poziom nauki:");
			if (a==1){
				System.out.println("szko�a podstawowa.");
			} else {
				System.out.println("szko�a gimnazjalna.");
			}
			System.out.println("Klasa do kt�rej ucz�szcza: "+b+".");
			System.out.print("Profil klasy: ");
			switch (c){
			case 1:
				System.out.println("matematyczny.");
				break;
			case 2:
				System.out.println("biologiczny");
				break;
			case 3:
				System.out.println("og�lny.");
				break;
				default:
					System.out.println("WPROWADZONO NIEWLASCIWY PROFIL!!!");
			}
			System.out.println("Przedmioty na kt�re ucze� ucz�szcza: ");
			if (a==1){
				System.out.println("WF, j�zyk polski, matematyka.");
			} else {
				System.out.println("WF, j�zyk polski, matematyka, fizyka, chemia.");
			}
			System.out.println("Ucze� nie ucz�szcza na dodatkowe zaj�cia");
		}
		}	
	}

