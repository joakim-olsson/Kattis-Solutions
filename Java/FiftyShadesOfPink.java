import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 10/06/2020
 **/

public class FiftyShadesOfPink {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        while (N-- > 0) {
            String in = sc.next().toLowerCase();
            if (in.contains("pink") || in.contains("rose"))
                ans++;
        }
        System.out.println(ans == 0 ? "I must watch Star Wars with my daughter" : ans);
    }
}
