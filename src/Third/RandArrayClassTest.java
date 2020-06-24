package Third;

class Location {
    final int MAX = 7;

    final int X = 3;
    final int Y = 5;

    int[] locXArr;
    int[] locYArr;

    public Location() {
        locXArr = new int[MAX];
        locYArr = new int[MAX];

        for(int i = 0; i < MAX; i++) {

        }
    }
}
// 문제 1. 현재 내가 있는 위치가 (3, 5)에 있다.
//        주유소가 근처에 여러개 있다.
//        7개의 랜덤 좌표를 생성하자!
//        (생성 범위는 2 ~ 7로 만들자)
//        각 좌표의 거리값을 표현하시오.
public class RandArrayClassTest {
    public static void main(String[] args) {
        System.out.println("랜덤 좌표 문제");

        Location loc = new Location();
    }
}
