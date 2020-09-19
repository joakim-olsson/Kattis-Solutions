import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 06/06/2020
 **/

public class Tri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b == c)
            System.out.println(a + "+" + b + "=" + c);
        else if (a - b == c)
            System.out.println(a + "-" + b + "=" + c);
        else if (a * b == c)
            System.out.println(a + "*" + b + "=" + c);
        else if (a / b == c)
            System.out.println(a + "/" + b + "=" + c);
        else if (b + c == a)
            System.out.println(a + "=" + b + "+" + c);
        else if (b - c == a)
            System.out.println(a + "=" + b + "-" + c);
        else if (b * c == a)
            System.out.println(a + "=" + b + "*" + c);
        else if (b / c == a)
            System.out.println(a + "=" + b + "/" + c);
    }
}
