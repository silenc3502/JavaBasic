package Second;

// 클래스란 데이터와 데이터를 다루는 기능 집합
// 클래스 작성법
// 1. class 적고 중괄호를 열고 닫는다.
// 2. 클래스의 이름을 작성한다.
//    클래스 작성시 규칙이 있는데
//    단어의 시작부분을
//    항상 대문자로 작성해주는 것이 좋다.
// 3. 클래스 내부에서 다룰 데이터를 작성한다.
// 4. 해당 데이터들을 다룰 수 있는 매서드를 작성한다.
class Person {
    // 데이터란 결국 클래스 내부에 있는 변수
    String name;
    int age;

    // Alt + insert: Getter & Setter
    // getter는 클래스 내부값을 가져오는데 사용
    // setter는 클래스 내부에 값을 설정하는데 사용

    // 매서드를 작성하는 방법
    // 1. 리턴 타입을 적는다.
    // 2. 매서드의 이름을 적는다.
    // 3. 인자(파라미터) - 입력을 작성한다.
    // 4. 중괄호 내부에
    //    매서드가 수행하는 기능을 작성한다.

    // 리턴 타입: String
    // 매서드의 이름: getName
    // 인자: 없음 - ()
    // 내부: return name
    // return하는 데이터의 데이터타입과
    // 위의 리턴 타입이 일치해야 한다.
    public String getName() {
        return name;
    }

    // 리턴 타입: int
    // 매서드 이름: getAge
    // 내부: return age
    public int getAge() {
        return age;
    }

    // 리턴 타입: void(없음)
    // 매서드 이름: setName
    // 인자: String name
    // 내부: this.name = name
    // this는 자기 자신을 의미
    // (클래스 내부에 있는 name)
    public void setName(String name) {
        // 클래스 내부의 name에
        // 입력으로 들어온 name을 넣으세요.
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SecondPerson {
    public static void main(String[] args) {
        System.out.println("class test");

        // Scanner scan = new Scanner(System.in);
        // 클래스 내부에 있는 데이터와
        // 매서드를 사용하기위한 단계
        int    p2 = 3;
        Person p  = new Person();
        // 위의 두 코드를 보면
        // 결국 클래스는 사용자가 직접 만드는
        // 커스텀 데이터 타입이란 것을 상기할 수 있다.
        
        // .이 들어있으면 클래스 내부에 있는
        // 매서드를 사용하겠다라는 의미
        // Person 클래스에 있는 setName을 동작시킨다.
        p.setName("test");
        p.setAge(77);

        System.out.println("getter를 활용하여 " +
                "클래스 내부 데이터를 가져옵니다.");
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}

// 숙제.

// 1. Student 클래스 작성해보기
//    이름, 나이, 전공

// 2. Vehicle 클래스 작성해보기
//    이름, 색상, 속도

// 3. 1 ~ 20까지 숫자중
//    짝수들의 합을 산출하는 매서드를
//    클래스 내부에 구현해보도록 한다.