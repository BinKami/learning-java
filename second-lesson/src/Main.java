import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        double a = 10.00;
//        double b = 5.0;

//        a += 3.0;  czyli jest to a = a + 3.00; możemy użyć jeszcze -=, *= oraz /=


//        skrócony zapis operacji na liczbach
//        czyli dodawanie liczb na zdefiniowanych liczbach w kodzie


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę rzeczywistą: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę rzeczywistą: ");
        double b = scanner.nextDouble();

        System.out.println("Wynik dodawania wynosi: " + (a + b));
        System.out.println("Wynik odejmowania wynosi: " + (a - b));
        System.out.println("Wynik odejmowania wynosi: " + (a * b));
        System.out.println("Wynik dzielenia wynosi: " + (a / b ));
    }
}