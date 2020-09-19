import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 27/05/2020
 **/

public class Kornislav {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];

        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[0] * nums[2]);
    }
}
