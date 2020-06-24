package Third;

import java.util.Random;

public class ThirdRandom {
    public static void main(String[] args) {
        Random rand = new Random();

        int cnt = 0;
        for(int i = 0; i < 10; i++, cnt++) {
            if(cnt % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%3d",
                    rand.nextInt(1) + 1
            );
        }

        // rand.nextInt()는 랜덤값을 생성한다.
        // bound것이 범위(개수)
        // 1을 적으면 0
        // 2를 적으면 0, 1
        // 30을 적으면 0 ~ 29
        // n을 적으면 0 ~ (n-1)
    }
}
