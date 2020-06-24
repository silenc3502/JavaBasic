package Third;

class Vehicle {
    private String color;
    private String name;
    private float speed;

    // 생성자(Constructor)
    // 생성자는 클래스 내부의 변수와
    // 클래스 내부의 매서드를 사용할 수 있도록
    // 메모리에 배치하는 작업을 수행한다.
    // (우리가 컴퓨터에서 사용하는 모든 데이터는
    //  반드시 메모리 상에 올라가야만 동작한다)
    public Vehicle() {
        System.out.println("뭐시 ?");
    }

    public Vehicle(String n, String c, float s) {
        name = n;
        color = c;
        speed = s;
    }

    // 자동 완성으로 getter를 만들었다.
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public float getSpeed() {
        return speed;
    }
}

// 생성자
public class ThirdConstruct {
    public static void main(String[] args) {
        // 최소 알아야 하는 메모리 섹션 4개
        // Text | Data | Heap | Stack
        // new를 할 경우엔 메모리가 Heap에 잡힌다.
        // 그 외의 것들은 메모리가 Stack에 잡힌다.
        Vehicle v1 = new Vehicle();

        // class 작성시 원칙이 있다.
        // 1. 캡슐화
        // 2. 정보 은닉
        /*
        v1.color = "색상";
        v1.speed = 30.3f;
        v1.name = "포르쉐 918";
         */

        Vehicle v2 = new Vehicle(
                "포르쉐 918", "파랑", 210.7f
        );

        System.out.println(v2.getColor());
        System.out.println(v2.getSpeed());
        System.out.println(v2.getName());
    }
}
