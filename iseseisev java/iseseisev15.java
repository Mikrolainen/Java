import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class iseseisev15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta isikukood: ");
        String isikukood = scanner.nextLine();

        if (isikukood.length() != 11 || !isikukood.matches("[0-9]+")) {
            System.out.println("Vigane isikukood.");
        } else {
            char suguIndikaator = isikukood.charAt(0);
            int sünniaasta;
            int sünnikuu;
            int sünnipäev;

            if (suguIndikaator == '3' || suguIndikaator == '4') {
                sünniaasta = 1900 + Integer.parseInt(isikukood.substring(1, 3));
            } else {
                sünniaasta = 2000 + Integer.parseInt(isikukood.substring(1, 3));
            }

            sünnikuu = Integer.parseInt(isikukood.substring(3, 5));
            sünnipäev = Integer.parseInt(isikukood.substring(5, 7));

            if (sünnikuu <= 0 || sünnikuu > 12 || sünnipäev <= 0 || sünnipäev > 31) {
                System.out.println("Vigane isikukood.");
            } else {
                String sugu = (suguIndikaator % 2 == 0) ? "Naine" : "Mees";

                SimpleDateFormat dateform = new SimpleDateFormat("dd.MM.yyyy");
                String sünnikuupäevStr = String.format("%02d.%02d.%04d", sünnipäev, sünnikuu, sünniaasta);

                System.out.println(sugu + ", " + sünnikuupäevStr);
            }
        }
    }
}
