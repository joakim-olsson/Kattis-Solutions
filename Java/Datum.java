import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 28/05/2020
 **/

public class Datum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();

        System.out.println(LocalDate.of(
                Integer.valueOf("2009"),
                month,
                day
        ).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
