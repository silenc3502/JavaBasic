package Second;

import java.util.Scanner;

public class SecondTest {
    public static void main(String[] args) {
        System.out.println("문제 은행");

        // 1. 1 ~ 20까지 숫자중 짝수를 출력해보세요.
        // 1-1. 1 ~ 20까지 출력을 해보자!
        for(int idx = 1; idx <= 20; idx++) {
            System.out.println(idx);
        }
        // 1-2. 짝수를 어떻게 찾을까 ?
        //      Scanner, if를 사용해서
        //      입력값이 짝수인지 홀수인지 판별을 어떻게 할것인가
        Scanner scan = new Scanner(System.in);
        System.out.print("홀짝을 판별해보자: ");
        int num = scan.nextInt();
        // %연산자는 나머지를 구하라는 연산자
        if(num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
        // 1-3. 1 ~ 20까지 출력한 부분에 해당 내용을 결합하자!
        // while + if, for + if
        System.out.println("짝수만 뽑아보자 ~");
        for(int idx = 1; idx <= 20; idx++) {
            if(idx % 2 == 0) {
                System.out.println(idx);
            }
        }

        // 2. 1 ~ 20까지 숫자중 홀수의 합을 구하세요.
        // while + if, for + if
        int idx = 1;
        int sum = 0;
        int cnt = 0;

        // 1 ~ 20 까지 반복하기 위함
        while(idx <= 20) {
            // 그중에서 홀수들을 찾기 위한 작업
            if(idx % 2 == 1) {
                // sum에 더하고 있다.
                // sum += idx;
                sum = sum + idx;
                System.out.printf(
                        "%d: %d\n", ++cnt, sum
                );
            }
            idx++;
        }

        System.out.println("홀수의 합 = " + sum);

        sum = 0;

        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println("홀수의 합 = " + sum);
    }
}
