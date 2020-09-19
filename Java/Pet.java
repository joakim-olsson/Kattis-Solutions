import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class Pet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contestantNum = 0;
        int max = 0;

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            if (sum > max) {
                max = sum;
                contestantNum = i + 1;
            }
        }
        System.out.println(contestantNum + " " + max);
    }
}
