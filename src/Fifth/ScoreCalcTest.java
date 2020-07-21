package Fifth;

class Person {
    private String name;
    private int age;
}

class Bachelor extends Person {
    private String major;
    private String minor;
}

class Master extends Bachelor {
    private String paper;
}
// 문제 2. 일반 학사와 석사 학생의 성적 관리 프로그램을 작성한다.
//        성적 관리시 평균과 표준편차를 계산하도록 한다.

// 1. Person을 Bachelor와 Master가 상속받도록 한다.
// 2. Bachelor를 Master가 상속받도록 만든다.
// 3. 그냥 다 따로 만든다.
public class ScoreCalcTest {
}
