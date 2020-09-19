import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 25/05/2020
 **/

public class StarArrangements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        System.out.println(S + ":");
        for (int i = 2; i <= S/2 + 1; i++) {
            int j = i - 1;
            if (S % (i + j) == i || S % (i + j) == 0)
                System.out.println(i + "," + j);
            if (S % i == 0)
                System.out.println(i + "," + i);
        }
    }
}
