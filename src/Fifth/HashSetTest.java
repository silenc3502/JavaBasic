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

        // Java의 새로운 foreach 구문
        // arr에 있는 값을 땡겨와서 value에 넣는다(그 타입이 Integer)
        for(Integer value: arr) {
            cnt++;
            // s는 집합이므로 중복을 허용하지 않으며
            // s.add()의 결과는 중복이라면 0을 리턴하고
            // 중복이 아니라면 1을 리턴하게 된다.
            // 즉 중복된 녀석이 출력이되고
            // 중복이 아닌 경우엔 출력이 되지 않는다.
            if(!s.add(value)) {
                System.out.println(
                        cnt + "루프-중복된 녀석: " + value);
            }
        }
        System.out.println("중복되지 않은 녀석: " + s);
    }
}

// 0. 복습(눈으로만 보는거 x, 코드 쳐봐야 실력이 늘어요 o)
// 1. ArrayList를 가지고 랜덤한 값을 10 개 입력받고
//    입력받은 값을 랜덤한 조합으로 더해서 합친 결과를 다시 ArrayList에 저장해보자.
// 2. Vector로 ArrayList로 구했던 빈도수 문제를 다시 풀어보자