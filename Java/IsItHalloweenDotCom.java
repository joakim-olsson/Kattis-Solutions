import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class IsItHalloweenDotCom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int day = sc.nextInt();

        if (month.equals("OCT") && day == 31 || month.equals("DEC") && day == 25)
            System.out.println("yup");
        else
            System.out.println("nope");
    }
}
