package Sixth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        // 확률 분포중 균일 분포를 따름
        // (즉 모든 값이 나올 확률이 골고루 있음)
        Collections.shuffle(list);
        System.out.println(list);
    }
}
