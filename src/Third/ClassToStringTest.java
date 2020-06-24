package Third;

class ToStringTest {
    int age;
    String name;

    public ToStringTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // toString()에 코드를 작성하면
    // println()을 통해 클래스 내부의 정보를 볼 수 있다.
    public String toString () {
        return "name = " + name + ", age = " + age;
    }
}

public class ClassToStringTest {
    public static void main(String[] args) {
        // 객체란 무엇인가 ?
        // 객체는 메모리상에 올라간 데이터
        ToStringTest tst1 =
                new ToStringTest(
                        77, "hihi"
                );

        System.out.println("tst1 = " + tst1);

        // 객체들은 서로 독립적이다.
        ToStringTest tst2 =
                new ToStringTest(
                        33, "test"
                );

        System.out.println("tst2 = " + tst2);
        System.out.println("tst1 = " + tst1);
    }
}
