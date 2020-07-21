package Fifth;

import java.util.Arrays;
import java.util.Random;

class Person {
    private String name;
    private int age;
    Random rand;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        rand = new Random();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Bachelor extends Person {
    private String major;
    private String minor;
    private float[] scores;

    final int MAX = 4;

    public Bachelor(String name, int age,
                    String major, String minor) {
        super(name, age);
        this.major = major;
        this.minor = minor;

        scores = new float[MAX];

        for(int i = 0; i < MAX; i++) {
            scores[i] = rand.nextInt(101);
        }
    }

    @Override
    public String toString() {
        return "Bachelor{" +
                "major='" + major + '\'' +
                ", minor='" + minor + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}

class Master extends Bachelor {
    private String paper;
    private float[] scores;

    final int MAX = 2;

    public Master(String name,
                  int age, String major,
                  String minor, String paper) {
        super(name, age, major, minor);
        this.paper = paper;

        scores = new float[MAX];

        for(int i = 0; i < MAX; i++) {
            scores[i] = rand.nextInt(101);
        }
    }

    @Override
    public String toString() {
        return "Master{" +
                "paper='" + paper + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
// 문제 2. 일반 학사와 석사 학생의 성적 관리 프로그램을 작성한다.
//        성적 관리시 평균과 표준편차를 계산하도록 한다.

// 1. Person을 Bachelor와 Master가 상속받도록 한다.
// 2. Bachelor를 Master가 상속받도록 만든다.
// 3. 그냥 다 따로 만든다.
public class ScoreCalcTest {
    public static void main(String[] args) {
        Person p1 = new Person(
                "으아앜", 20
        );
        System.out.println(p1);

        Bachelor b1 = new Bachelor(
                "쀍뚫쒫", 21,
                "스타1", "스타2"
        );
        System.out.println(b1);

        Master m1 = new Master(
                "안녕", 33,
                "통계학", "전기/전자",
                "인간은 어디에서 왔는가 ?"
        );
        System.out.println(m1);
    }
}
