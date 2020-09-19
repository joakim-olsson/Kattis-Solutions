import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 16/05/2020
 **/

public class Autori {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("-");

        for (int i = 0; i < input.length; i++)
            System.out.print(input[i].charAt(0));
    }
}
