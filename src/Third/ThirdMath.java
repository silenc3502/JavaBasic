package Third;

public class ThirdMath {
    public static void main(String[] args) {
        int width = 3;
        int height = 4;
        int diag;
        // 피타고라스 정리 3, 4, 5비율의 프로그램 증명
        // Math.sqrt()는 루트
        // Math.pow(x, n)는 x의 n승
        // Math.pow()는 멱급수를 표현함
        diag = (int)Math.sqrt(
            Math.pow(width, 2) + Math.pow(height, 2)
        );

        System.out.println("대각선 길이 = " + diag);
    }
}
