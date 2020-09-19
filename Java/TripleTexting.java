import java.util.*;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 30/05/2020
 **/

public class TripleTexting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        String in = sc.next();
        String word1 = in.substring(0, in.length()/3);
        String word2 = in.substring(in.length()/3, in.length()*2/3);
        String word3 = in.substring(in.length()*2/3);
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i) || word1.charAt(i) != word3.charAt(i) || word1.charAt(i) != word2.charAt(i)) {
                set.add(word1.charAt(i));
                if (set.contains(word2.charAt(i)))
                    ans.append(word2.charAt(i));
                else
                    ans.append(word3.charAt(i));
            } else
                ans.append(word1.charAt(i));
        }
        System.out.println(ans);
    }
}
