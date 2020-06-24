package Second;

public class SecondForTest {
    public static void main(String[] args) {
        System.out.println("For문에 익숙해지자!");

        // 1. 3 ~ 10까지 출력해보자!
        for(int i = 3; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. 10 ~ 20까지 출력해보자!
        for(int i = 10; i <= 20; i++) {
            System.out.println(i);
        }

        // 3. 5 ~ 10까지 출력하고
        //    그중 홀수들의 합을 구해보자!
        int sum = 0;
        for(int i = 5; i <= 10; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
