package Third;

class ArrayClass {
    // fianl은 값을 고정시킨다.
    final int MAX = 4;
    float englishScore[];

    // 입력으로 배열을 전달 받아서
    // 내부에 있는 englishScore 배열을 채운다.
    public ArrayClass(float[] arr) {
        // 배열을 Heap 할당
        englishScore = new float[MAX];

        // for를 돌면서 클래스 내부 배열에
        // 외부에서 입력으로 들어온 배열을 채워넣는 과정
        for(int i = 0; i < MAX; i++) {
            englishScore[i] = arr[i];
        }
    }

    // 4년치의 영어 성적 평균을 계산하여 반환한다.
    public float calcMean() {
        // 초기화를 안해주면 잘못된 값이 연산됨
        // 시작값이 0이 아니라
        // 123782 <<< 이런 값이 들어있을 수도 있다.
        // 그래서 누적연산(시그마)을 하는 경우
        // 반드시 0으로 초기화해줄 필요가 있다.
        float sum = 0;

        // 앞서 배열로 받았던 값들을 누적 시키고 있다.
        // 시그마
        for(int i = 0; i < MAX; i++) {
            sum += englishScore[i];
        }

        // 4개의 점수들을 합쳐서 개수인 4개로 나눴다.
        // 평균
        return sum / MAX;
    }
}

public class ThirdClassArray {
    // 처음 프로그램의 시작은 main 부터!
    public static void main(String[] args) {
        System.out.println("Third Class Array");

        // Stack에 배열을 할당하는 방법
        // 스택에 배열을 할당하는 방법
        // 1. 중괄호를 열고 닫는다.
        // 2. 중괄호 안에 담을려고 하는 값들을 작성한다.
        // 3. 값들간의 구분은 , 를 통해서 구분한다.
        float[] arr = {33.3f, 77.7f, 87.2f, 50.8f};

        // new를 통해서 할당하는 경우
        // 1. float[] arr = new float[4];
        // 생성자(클래스의 이름과 같다)를 호출
        // - 배열의 이름은 배열 전체를 대표한다.
        ArrayClass ac = new ArrayClass(arr);
        System.out.println("평균 = " + ac.calcMean());
    }
}

// 문제 1. 현재 내가 있는 위치가 (3, 5)에 있다.
//        주유소가 근처에 여러개 있다.
//        7개의 랜덤 좌표를 생성하자!
//        (생성 범위는 2 ~ 7로 만들자)
//        각 좌표의 거리값을 표현하시오.