import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 1.5;

        double c = a / b;


    //    System.out.println(Math.round(c*100.0)/100.0); // zaokrąglanie liczby w podstawowy sposób.
        System.out.println(Math.round(c)); // round w góre i całkowita long, ceil w dół, floor w góre double

        BigDecimal roundedNumber = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP); // zaokrąglanie za pomocą bigDecimal.
      //Instacja   nazwa zmiennej  nowa instancjka   ustawienie skaliNp2, Mod do ustalenia jak zaokrąglić.

        System.out.println(roundedNumber.doubleValue()); // tak wygląda wyplucie przez system.

        DecimalFormat decimalFormat = new DecimalFormat("###.##"); // bez informowania o zaokrąglaniu.
        System.out.println(decimalFormat.format(c));
      //                                 wybranie odpowiedniej intacnji

        String formatedNumber = String.format("%.2f", c); // wyświetlenie liczby z dokładnością do 2 miejsc a następnie podajemy ziemnną double
        System.out.println(formatedNumber);





    }
}