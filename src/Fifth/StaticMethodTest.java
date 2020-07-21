package Fifth;

class StaticMethod {
    // 어떤것들을 static 매서드로 만드는게 좋을까 ?
    // 빈번한 입력에 대해서 static 매서드를 적용해주면
    // 구지 쓸대없이 new를 할 필요가 없어진다.
    public static void test() {
        System.out.println("test");
    }
}

public class StaticMethodTest {
    public static void main(String[] args) {
        // 원래 방식은 아래와 같다.
        // StaticMethod sm = new StaticMethod();
        // sm.test();
        // Finish Origin
        StaticMethod.test();
    }
}
