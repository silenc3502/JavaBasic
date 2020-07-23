package Seventh;

// interface 사용 목적이 동일한 이름으로 여러가지 기능을 처리하기 위함
// 어떤 게임에 유닛이 1000개 있다고 가정
// 다형성을 추구하는 녀석
// 제어 역전(인터페이스 기반) - 향후 설명
// A - attack()
// B - bAttack()
// C - cAttack()
// D - dAttack()
// ....
// 1000개 작성
interface Comparable{
    int compareTo(Object other);
}

// interface에는 매서드의 선언부만 들어있다.
// 구현부는 해당 인터페이스를 사용하는 클래스에서 직접 작성해줘야 한다.
// 인터페이스를 사용한다는 명시는 implements 키워드를 통해 사용한다.
// abstract class는 일반 클래스와 동일한 상태에서
// 추가적으로 interface를 내부에 함포하고 있다.
// 일반 interface는 단순히 매서드 선언부만 포함한다.
class MyStrcmp implements Comparable {
    private double area = 0;

    public MyStrcmp(double area) {
        this.area = area;
    }

    public int compareTo(Object otherObj) {
        MyStrcmp other = (MyStrcmp) otherObj;
        if(this.area < other.area) {
            return -1;
        } else if(this.area > other.area) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        MyStrcmp ms1 = new MyStrcmp(33.3);
        MyStrcmp ms2 = new MyStrcmp(77.7);

        if (ms1.compareTo(ms2) > 0) {
            System.out.println("ms1이 ms2보다 크다.");
        } else if (ms1.compareTo(ms2) < 0) {
            System.out.println("ms1가 ms2보다 작다.");
        } else {
            System.out.println("ms1과 ms2는 같다.");
        }
    }
}
