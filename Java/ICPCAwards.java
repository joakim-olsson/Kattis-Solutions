import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 27/05/2020
 **/

public class ICPCAwards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String[] in = sc.nextLine().split(" ");
            if (!set.contains(in[0]))
                System.out.println(in[0] + " " + in[1]);
            set.add(in[0]);

            if (set.size() == 12)
                return;
        }
    }
}
