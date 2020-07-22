package Sixth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptionTest {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");

        try {
            i = scan.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("정수를 입력하세요!");
        }
        System.out.println("왓 더");
    }
}
