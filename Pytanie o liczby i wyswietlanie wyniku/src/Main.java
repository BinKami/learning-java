import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą");
        int a = scanner.nextInt();

        System.out.println("Podaj drugą liczbę całkowitą");
        int b = scanner.nextInt();


        System.out.println("Wynik dodawania to: " + (a + b));
        System.out.println("Wynik odejmowania to: " + (a - b));
        System.out.println("Wynik mnożenia to: " + (a * b));
        System.out.println("Wynik dzielenia to: " + (a / b));

    }
}