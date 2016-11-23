import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("OPERACJE NA DZIALANIACH ARTMETYCZNYCH \n");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Podaj pierwsza liczbe ");
		int a = scan.nextInt();
		System.out.println("Podaj druga liczbe ");
		int b = scan.nextInt();
		int c; //wynik
		System.out.println("Wybierz pozycje z menu \n1. Dodawanie \n2. Odejmowanie \n3. Mno¿enie \n4. Dzielenie");
		int typeOfOperation=scan.nextInt();
		switch (typeOfOperation){
		case 1:
			c=a+b;
			System.out.println("Wybra³es dodawanie "+ a +"+"+b+"="+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Wybra³es odejmowanie "+ a +"-"+b+"="+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Wybra³es mno¿enie "+ a +"*"+b+"="+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Wybra³es dzielenie "+ a +"/"+b+"="+c);
			break;
		default:
			System.out.println("Wybra³eœ niew³aœciwe dzia³anie!!!");
		}
			
		
		
		
	}

}
