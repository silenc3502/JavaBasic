package Fifth;

class Car {
    private int speed;
    private int gear;
    private String color;

    public Car(int speed, int gear, String color) {
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public String getColor() {
        return color;
    }
}

class SportsCar extends Car {
    boolean boost;

    public SportsCar(int speed, int gear,
                     String color, boolean boost) {
        // 상위의 Parent에 접근하기 위해 사용했음
        // super. 이란 결국 상위 클래스 자체를 의미했음
        // 생성자의 특성: 클래스명과 매서드명이 같음
        // 결국 상위 클래스의 생성자를 호출한다.
        super(speed, gear, color);
        this.boost = boost;
    }

    public void setBoost(boolean deter) {
        boost = deter;
    }

    @Override
    public String toString() {
        // 상속받은 정보들은 자식이 사용할 수 있다.
        // 단, private은 제외되므로
        // 아래와 같이 부모쪽의 매서드를 활용한다.
        return "SportsCar{" +
                "speed=" + getSpeed() +
                ",gear=" + getGear() +
                ",color=" + getColor() +
                ",boost=" + boost +
                '}';
    }
}

public class CarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar(
                300, 12,
                "metalblack",
                true
        );
        System.out.println(sc);
    }
}

// 문제 1. Vehicle 클래스를 만든다.
//        그리고 Airplane과 Car 클래스를 만든다.
//        이때 Airplane과 Car는 Vehicle을 상속받는다.
//        내부 변수들을 출력할 수 있게 만들도록 한다.

// 문제 2. 일반 학사와 석사 학생의 성적 관리 프로그램을 작성한다.
//        성적 관리시 평균과 표준편차를 계산하도록 한다.