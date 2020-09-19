import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 24/05/2020
 **/

public class NoDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        while (sc.hasNext()) {
            String s = sc.next();
            if (set.contains(s)) {
                System.out.println("no");
                return;
            }
            set.add(s);
        }
        System.out.println("yes");
    }
}
