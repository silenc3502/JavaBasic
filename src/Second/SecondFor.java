package Second;

public class SecondFor {
    public static void main(String[] args) {
        System.out.println("for test");

        // 작성법
        // 1. for를 적고 소괄호를 열고 닫고 중괄호를 열고 닫는다.
        // 2. for의 내부 구성은 아래와 같다.
        //    for(초기화; 조건; 증감부)
        // 3. 중괄호 안에는 조건이 만족 되었을 경우 작동할 코드

        int cnt;
        // for의 초기화 부분은 최초 진입시 단 한 번만 수행된다.
        // 조건은 for문의 내부로 진입할지 말지 여부를 결정
        // 증감부는 for문 내부를 한 번 실행하고나서 수행됨
        // 증감부를 수행하고 난 이후에 다시 조건을 검사한다.
        for(cnt = 0; cnt < 10; cnt++) {
            System.out.println(cnt);
        }

        System.out.println("final cnt = " + cnt);
    }
}
