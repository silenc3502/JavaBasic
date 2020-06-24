package Third;

import java.util.Random;

class Location {
    final int MAX = 7;

    final int X = 3;
    final int Y = 5;

    int[] locXArr;
    int[] locYArr;

    float[] distArr;

    Random rand;

    public Location() {
        rand = new Random();

        locXArr = new int[MAX];
        locYArr = new int[MAX];

        distArr = new float[MAX];

        for(int i = 0; i < MAX; i++) {
            // locXArr와 locYArr를 채운다.
            // 2 ~ 7 >>> 0 ~ 5
            locXArr[i] = rand.nextInt(6) + 2;
            locYArr[i] = rand.nextInt(6) + 2;
        }
    }

    public void calcDistance() {
        // distArr를 구한다.
        // 기준점이 (0, 0) X
        // 기준점이 현재 내 위치(3, 5)라는 부분을 주의
        for(int i = 0; i < MAX; i++) {
            distArr[i] = (float)Math.sqrt(
                Math.pow(X - locXArr[i], 2) +
                Math.pow(Y - locYArr[i], 2)
            );
            System.out.println(distArr[i]);
        }
    }

    public String toString() {
        String res = "";
        int i, cnt = 0;

        for(i = 0; i < MAX - 1; i++, cnt++) {
            if(cnt % 4 == 0) {
                res += "\n";
            }
            res += distArr[i] + ", ";
        }
        res += distArr[i];

        return res;
    }
}
// 문제 1. 현재 내가 있는 위치가 (3, 5)에 있다.
//        주유소가 근처에 여러개 있다.
//        7개의 랜덤 좌표를 생성하자!
//        (생성 범위는 2 ~ 7로 만들자)
//        각 좌표의 거리값을 표현하시오.

// 현재 만들어진 코드를 기반으로
// 아래 작업을 진행하면 문제를 풀 수 있다.
// 1. 생성자 작성을 완료한다.
//    반복을 하면선 랜덤 좌표를 생성하는 작업
// 2. calcDistance() 매서드를 작성한다.
public class RandArrayClassTest {
    public static void main(String[] args) {
        System.out.println("랜덤 좌표 문제");

        Location loc = new Location();
        loc.calcDistance();
        // System.out.println(loc);
    }
}
