import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 07/06/2020
 **/

public class OddManOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int caseNum = 1;
        while (N-- > 0) {
            int G = sc.nextInt();
            Set<Integer> invCode = new HashSet<>();
            while (G-- > 0) {
                int code = sc.nextInt();
                if (invCode.contains(code))
                    invCode.remove(code);
                else
                    invCode.add(code);
            }
            System.out.println("Case #" + caseNum + ": " + invCode.toArray()[0]);
            caseNum++;
        }
    }
}
