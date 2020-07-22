package Sixth;

public class FinallyTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            arr[11] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("범위 벗어났어.");
        } finally {
            arr = null;
        }

        System.out.println("나온다");
    }
}
