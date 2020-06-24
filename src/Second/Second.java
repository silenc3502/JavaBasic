package Second;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Second Test");

        System.out.print("첫 번째 정수를 입력해주세요: ");
        int num1 = scan.nextInt();

        // 주석(다른 사람이 작성한 코드)
        System.out.print("두 번째 정수를 입력해주세요: ");
        int num2 = scan.nextInt();

        // if문을 작성하는 방법
        // 1. if를 적고 소괄호를 열고 닫고 중괄호를 열고 닫는다.
        // 2. 괄호 안에 조건을 작성한다.
        //    (괄호 내부에 작성하는 모든것은 참 혹은 거짓으로 판정된다)
        // 3. 조건을 작성한 이후 중괄호 내부에서 작동할 코드를 작성한다.
        //    (중괄호 내부란 조건이 만족했을 경우를 의미함)
        if(num1 < num2) {
            System.out.printf("%d는(은) %d 보다 작다.\n", num1, num2);
        } else if(num1 == num2) {
            System.out.println("두 숫자는 같다.");
        }
        // else: ~이 아니면
        // 맨 위의 if문 조건이 만족되지 않는다면
        else {
            System.out.printf("%d는(은) %d 보다 크다.\n", num1, num2);
        }

        // Boolean 데이터 타입은 참과 거짓을 표현할 수 있다.
        // num1이 num2 보다 작은가요 ?
        Boolean isTrue = num1 < num2;
        System.out.println(isTrue);

        // num1이 num2 보다 크거나 같은가요 ?
        isTrue = num1 >= num2;
        System.out.println(isTrue);

        // num1이 num2와 같은가요 ?
        isTrue = num1 == num2;
        System.out.println(isTrue);

        // num1이 num2랑 다른가요 ?
        isTrue = num1 != num2;
        System.out.println(isTrue);
    }
}


