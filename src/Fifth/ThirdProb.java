package Fifth;

import java.util.ArrayList;
import java.util.Random;

/* 문제 3.
 * 10 ~ 60까지의 난수를 200개 생성한다.
 * 생성한 정보들에 대한 빈도수를 판정하라. */
public class ThirdProb {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> freq = new ArrayList<Integer>();
        Random rand = new Random();
        int[] arr;

        final int MAX = 200;
        final int RANGE = 51;

        for(int i = 0; i < MAX; i++) {
            // 10 ~ 60
            list.add(rand.nextInt(RANGE) + 10);
        }

        for(int i = 0; i < RANGE; i++) {
            freq.add(i, 0);
        }

        for(int i = 0; i < MAX; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for(int i = 0; i < MAX; i++) {
            int idx = list.get(i) - 10;
            int tmp = freq.get(idx);
            freq.add(idx, ++tmp);
            freq.remove(idx + 1);
            // 현재 가지고 있는 리스트에서 어떤 값이 나왔는가 ?
            // 해당 값을 빈도수 배열의 인덱스로 사용한다.
            // 현재 가져온 값이 기존에 이미 있는지 없는지를 판정해야함
            // 값이 존재한다면 해당값 + 1을 넣고 뒤로 밀린값은 삭제
            //freq.add(list.get(i) - 1, )
        }

        for(int i = 0; i < RANGE; i++) {
            System.out.print(freq.get(i) + " ");
        }
        System.out.println();

        arr = new int[RANGE];

        for(int i = 0; i < MAX; i++) {
            arr[list.get(i) - 10]++;
        }

        for(int i = 0; i < RANGE; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
