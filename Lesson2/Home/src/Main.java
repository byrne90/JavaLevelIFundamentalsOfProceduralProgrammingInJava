import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
      String imie; //w nim zapiszemy swoje imie
      Scanner odczyt = new Scanner(System.in); // obiekt do odbierania danych przez uzytkownika
 
      imie = odczyt.nextLine();
 
      System.out.println("Witaj "+imie); //wyswietlamy powitanie
  }
}