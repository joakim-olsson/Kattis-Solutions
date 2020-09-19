import java.util.*;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 30/05/2020
 **/

public class SymmetricOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int set = 1;

        while (num != 0){
            System.out.println("SET " + set);
            int temp = num;
            String[] names = new String[num];

            for (int i = 0; i < num / 2; i++){
                names[i] = sc.next();
                names[temp-1] = sc.next();
                temp--;
            }
            if (num % 2 != 0)
                names[num/2]= sc.next();

            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
            set++;
            num = sc.nextInt();
        }
    }
}
