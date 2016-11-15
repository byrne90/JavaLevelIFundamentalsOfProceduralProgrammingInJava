import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double a, b, c; //korzystam z double gdyz tego wymaga funckja sqrt i pow
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Podaj wartosc pierwszej przyprostokatnej: ");
		a = scan.nextShort();
		
		System.out.println("Podaj wartosc drugiej przyprostokatnej: ");
		b = scan.nextShort();
		
		System.out.println("Wartosci podanych przez Ciebie przyprostokatnych to: " +a+", "+b);
		
		c= Math.sqrt((Math.pow(a, 2)+(Math.pow(b, 2))));
		System.out.println("Wartosc przeciwprostokatnej to: " +c);
	}

}
