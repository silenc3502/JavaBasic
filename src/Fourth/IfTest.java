package Fourth;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수 입력: ");
        int num = scan.nextInt();

        // num이 80보다 크냐 ?
        if(num >= 80) {
            System.out.println("B");
        // num은 80보다 작다.
        // + num은 90보다 크거나 같다.
        } else if(num >= 90) {
            System.out.println("A");
        }
    }
}
