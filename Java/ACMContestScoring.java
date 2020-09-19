import java.util.*;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 09/06/2020
 **/

public class ACMContestScoring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int numCorrectAnswers = 0;
        int score = 0;
        Map<String, Integer> attempted = new HashMap<>();

        while (M != -1) {
            String problemLetter = sc.next();
            String answer = sc.next();

            if (answer.equals("wrong")) {
                attempted.put(problemLetter, attempted.getOrDefault(problemLetter, 0) + 20);
                score += 20;
            }
            else {
                numCorrectAnswers++;
                score += M;
                attempted.remove(problemLetter);
            }
            M = sc.nextInt();
        }
        for (String key : attempted.keySet())
            score -= attempted.get(key);
        System.out.print(numCorrectAnswers + " ");
        System.out.println(numCorrectAnswers == 0 ? 0 : score);
    }
}
