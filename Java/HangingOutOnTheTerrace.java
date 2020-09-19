import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 22/05/2020
 **/

public class HangingOutOnTheTerrace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int x = sc.nextInt();
        int currCap = 0;
        int ans = 0;

        for (int i = 0; i < x; i++) {
            String event = sc.next();
            int p = sc.nextInt();

            if (event.equals("enter")) {
                if (currCap + p <= L)
                    currCap += p;
                else
                    ans++;
            } else {
                currCap -= p;
                if (currCap < 0)
                    currCap = 0;
            }
        }
        System.out.println(ans);
    }
}
