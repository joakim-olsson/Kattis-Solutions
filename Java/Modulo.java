import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class Modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }
        System.out.println(set.size());
    }
}
