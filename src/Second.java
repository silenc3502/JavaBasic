import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Second Test");

        System.out.print("첫 번째 정수를 입력해주세요: ");
        int num1 = scan.nextInt();

        System.out.print("두 번째 정수를 입력해주세요: ");
        int num2 = scan.nextInt();

        if(num1 < num2) {
            System.out.printf("%d는(은) %d 보다 작다.\n", num1, num2);
        }
    }
}


