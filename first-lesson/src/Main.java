import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();

        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();

        System.out.println("Cześć " + name + " !. Masz " + age
                + " lat!");
    }
}