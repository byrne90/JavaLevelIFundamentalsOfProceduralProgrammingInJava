
public class Main {

	public static void main(String[] args) {
		char firstLetterName = '£';
		String surname = "Byra";
		byte temperatureTotal = 22;
		float temperatureFraction = 19.3f;
		String temperatureUnits = "st. C.";
		byte studentsQuanity = 24;
		float bodyweight = 62.5f;
		String weightUnits = "kg";
		short height = 189;
		int mountEverestInCm = 884800;
		String heightUnits = "cm";
		boolean isMailBoxEmpty = true;
		long neuronsQuanityInBrain = 1000000000;
		double PI;
		long facebookUsersQuanity;

		System.out.println("Pierwsza litera imienia: " + firstLetterName);
		System.out.println("Nazwisko: " + surname);
		System.out.println("Temperatura w liczbach calkowitych: " + temperatureTotal + " " + temperatureUnits );
		System.out.println("Temperatura w liczbach rzeczywistych: " + temperatureFraction + " " + temperatureUnits);
		System.out.println("Liczba uczniow w klasie: " + studentsQuanity);
		System.out.println("Waga ciala w kilogramach wyrazona liczba rzeczywista: " + bodyweight + " " + weightUnits);
		System.out.println("Wzrost wyrazony w centymetrach: " + height + " " + heightUnits);
		System.out.println("Wyskosc Mount Everest wyrazona w centymetrach: " + mountEverestInCm + " " + heightUnits);
		System.out.println("Czy skrzynka pocztowa jest pusta? " + isMailBoxEmpty);	
	
	}

}
