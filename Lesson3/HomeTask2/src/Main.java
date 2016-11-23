import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("DZIENNICZEK UCZNIA \n");

		System.out.println("Wprowadz nastêpuj¹ce dane ucznia:");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Podaj imie ucznia:");
		String name = scan.nextLine();
		
		System.out.println("Podaj nazwisko ucznia:");
		String surname = scan.nextLine();
		
		System.out.println("Podaj nazwe szkoly:");
		String schoolName= scan.nextLine();
		
		System.out.println("Wybierz poziom nauki:");
		int a; //poziom nauki
		System.out.println("WprowadŸ 1 - szko³a podstawowa.");
		System.out.println("WprowadŸ 2 - szko³a gimnazjalna.");
		a=scan.nextInt();
		
			System.out.println("Wybierz klasê:");
		int b; //klasa
		if (a==1){
			System.out.println("Wybraleœ szko³ê podstawow¹.");
			System.out.println("Podaj numer klasy od 1-6.");
			b=scan.nextInt();
		} 
		else {
			System.out.println("Wybra³eœ szko³ê gimnazjaln¹.");
			System.out.println("Wybierz numer klasy od 1-3.");
			b=scan.nextInt();
		}
		
		System.out.println("Wybierz profil klasy podaj¹c odpowiedni numer porz¹dkowy: ");
		System.out.println("1. matematyczna,");
		System.out.println("2. biologiczna,");
		System.out.println("3. ogólna.");
		int c; //profil klasy
		c=scan.nextInt();
		
		System.out.println("Dane ucznia: ");
		System.out.println("Imie i nazwisko: " +name+" "+surname);
		System.out.println("Szko³a do której uczêszcza: "+schoolName);
		System.out.print("Poziom nauki:");
		if (a==1){
			System.out.println("szko³a podstawowa.");
		} else {
			System.out.println("szko³a gimnazjalna.");
		}
		System.out.println("Klasa do której uczêszcza: "+b+".");
		System.out.print("Profil klasy: ");
		switch (c){
		case 1:
			System.out.println("matematyczny.");
			break;
		case 2:
			System.out.println("biologiczny");
			break;
		case 3:
			System.out.println("ogólny.");
			break;
			default:
				System.out.println("WPROWADZONO NIEWLASCIWY PROFIL!!!");
		}
		System.out.println("Przedmioty na które uczeñ uczêszcza: ");
		if (a==1){
			System.out.println("WF, jêzyk polski, matematyka.");
		} else {
			System.out.println("WF, jêzyk polski, matematyka, fizyka, chemia.");
		}
		
		System.out.println("Czy chcesz dopisaæ zajêcia dodatkowe na które uczeñ uczêszcza?");
		System.out.println("TAK - wprowadŸ 1.");
		System.out.println("NIE - wprowadŸ 2.");
		
		/*int d; //dodatkowe zajêcia
		d=scan.nextInt();
		String extraClass; //NIE DZIALA!! scan z warunku nie inicjalizuje Stringu!
		if (d==1){
			System.out.println("Podaj nazwy dodatkowych zajêæ:");
			Scanner scan2 =new Scanner (System.in);
			extraClass=scan2.nextLine();
			
		} 
		else {
			System.out.println("Uczeñ nie uczêszcza na dodatkowe zajêcia.");
		}
		System.out.println(extraClass);
		*/
		
		int e=scan.nextInt();
		if (e==1){
			System.out.println("Podaj nazwy dodatkowych zajêæ: ");
			Scanner scan2 =new Scanner (System.in);
			String extraClass=scan2.nextLine();
			System.out.println("Dane ucznia: ");
			System.out.println("Imie i nazwisko: " +name+" "+surname);
			System.out.println("Szko³a do której uczêszcza: "+schoolName);
			System.out.print("Poziom nauki:");
			if (a==1){
				System.out.println("szko³a podstawowa.");
			} else {
				System.out.println("szko³a gimnazjalna.");
			}
			System.out.println("Klasa do której uczêszcza: "+b+".");
			System.out.print("Profil klasy: ");
			switch (c){
			case 1:
				System.out.println("matematyczny.");
				break;
			case 2:
				System.out.println("biologiczny");
				break;
			case 3:
				System.out.println("ogólny.");
				break;
				default:
					System.out.println("WPROWADZONO NIEWLASCIWY PROFIL!!!");
			}
			System.out.println("Przedmioty na które uczeñ uczêszcza: ");
			if (a==1){
				System.out.println("WF, jêzyk polski, matematyka.");
			} else {
				System.out.println("WF, jêzyk polski, matematyka, fizyka, chemia.");
			}
			System.out.println("Dodatkowe zajêcia na które uczeñ uczêszcza: \n"+extraClass);
		}else {
			System.out.println("Dane ucznia: ");
			System.out.println("Imie i nazwisko: " +name+" "+surname);
			System.out.println("Szko³a do której uczêszcza: "+schoolName);
			System.out.print("Poziom nauki:");
			if (a==1){
				System.out.println("szko³a podstawowa.");
			} else {
				System.out.println("szko³a gimnazjalna.");
			}
			System.out.println("Klasa do której uczêszcza: "+b+".");
			System.out.print("Profil klasy: ");
			switch (c){
			case 1:
				System.out.println("matematyczny.");
				break;
			case 2:
				System.out.println("biologiczny");
				break;
			case 3:
				System.out.println("ogólny.");
				break;
				default:
					System.out.println("WPROWADZONO NIEWLASCIWY PROFIL!!!");
			}
			System.out.println("Przedmioty na które uczeñ uczêszcza: ");
			if (a==1){
				System.out.println("WF, jêzyk polski, matematyka.");
			} else {
				System.out.println("WF, jêzyk polski, matematyka, fizyka, chemia.");
			}
			System.out.println("Uczeñ nie uczêszcza na dodatkowe zajêcia");
		}
		}	
	}

