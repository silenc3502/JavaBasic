package Fifth;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        Random rand = new Random();

        final int MAX = 200;
        final int RANGE = 51;
        final int BIAS = 10;
        int cnt = 0;

        int[] arr = new int[MAX];

        for(int i = 0; i < MAX; i++) {
            arr[i] = rand.nextInt(RANGE) + BIAS;
        }

        for(Integer value: arr) {
            cnt++;
            if(!s.add(value)) {
                System.out.println(
                        cnt + "루프-중복된 녀석: " + value);
            }
        }
        System.out.println("중복되지 않은 녀석: " + s);
    }
}
