package Third;

class MySeries2 {
    int start, end;

    // 생성자 작성시 생성자는 클래스 이름과 동일하다.
    public MySeries2(int s, int e) {
        start = s;
        end = e;
    }

    // 매서드 작성시 첫번째 단어는 소문자
    // 두 번째 단어부터는 이니셜을 대문자로 작성한다.
    public int findEvenSum() {
        int idx;
        int sum = 0;

        for(idx = start; idx <= end; idx++) {
            if(idx % 2 == 0) {
                sum += idx;
            }
        }

        return sum;
    }
}

public class ThirdConsProb {
    public static void main(String[] args) {
        MySeries2 ms = new MySeries2(1, 20);

        System.out.println(
                "짝수의 합 = " + ms.findEvenSum()
        );
    }
}
