import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String firstname = scanner.nextLine();

        System.out.print("Podaj swoje nazwisko: ");
        String lastname = scanner.nextLine();

        System.out.print("Podaj swój wiek: ");
        int age = scanner.nextInt();

        System.out.println("Witaj " + firstname + " " + lastname + ". Masz " + age + " lat." );

    }
}