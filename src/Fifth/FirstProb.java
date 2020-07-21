package Fifth;

class Vehicle {
    private int speed;
    private String color;

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}

class Airplane extends Vehicle {
    private float height;

    public Airplane(int speed, String color,
                    float height) {
        super(speed, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "speed=" + getSpeed() +
                ", color=" + getColor() +
                ", height=" + height +
                '}';
    }
}

class TestCar extends Vehicle {
    private float jerk;

    public TestCar(int speed, String color,
                    float jerk) {
        super(speed, color);
        this.jerk = jerk;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + getSpeed() +
                ", color=" + getColor() +
                ", jerk=" + jerk +
                '}';
    }
}
// 문제 1. Vehicle 클래스를 만든다.
//        그리고 Airplane과 Car 클래스를 만든다.
//        이때 Airplane과 Car는 Vehicle을 상속받는다.
//        내부 변수들을 출력할 수 있게 만들도록 한다.
public class FirstProb {
    public static void main(String[] args) {
        Airplane a = new Airplane(
                900, "white", 1400
        );
        System.out.println(a);

        TestCar tc = new TestCar(
                240, "red", 0.3f
        );
        System.out.println(tc);
    }
}
