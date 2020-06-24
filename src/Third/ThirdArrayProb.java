package Third;

import java.util.Scanner;

/*
1. 먼저 사용자 입력을 받는 프로그램을 작성한다.
2. 사용자 입력을 받은만큼 배열을 만들어보자!
3. 각 배열에 피보나치 항을 배치해보자!
4. 마지막으로 결과를 출력한다.
 */
public class ThirdArrayProb {
    public static void main(String[] args) {
        // 1번 시작
        Scanner scan = new Scanner(System.in);
        System.out.print(
                "몇 번째 피보나치 항을 구할까요 ?"
        );
        // 1번 끝이자 2번 시작
        int arrLen = scan.nextInt();

        int[] arr = new int[arrLen];
        // 2번 끝
        // 3번 시작
        int idx;

        arr[0] = 1;
        arr[1] = 1;

        //   1   1   2   3   5   8   13  21
        //  [0] [1] [2] [3] [4] [5] [6] [7]
        for(idx = 2; idx < arrLen; idx++) {
            arr[idx] = arr[idx - 2] + arr[idx - 1];
        }
        // 3번 끝

        // 4번 시작과 끝
        System.out.printf(
                "당신이 찾는 %d번째 항은 %d입니다.\n",
                arrLen, arr[idx - 1]
        );
    }
}
