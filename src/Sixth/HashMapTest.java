package Sixth;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashMapTest {
    public static String randName() {
        final int START = 0;
        final int MAX = 3;
        final int RANGE = 14;

        String retStr = "";
        Random rand = new Random();

        String[] strArr = {
                "가", "나", "다", "라", "마", "바", "사",
                "아", "자", "차", "카", "타", "파", "하"
        };

        for(int i = START; i < MAX; i++) {
            retStr += strArr[rand.nextInt(RANGE)];
        }

        return retStr;
    }

    public static void main(String[] args) {
        final int START = 0;
        final int MAX = 7;
        final int RANGE = 30;
        final int BIAS = 20;

        Random rand = new Random();
        // 맵을 사용할 때는 앞쪽에 key로 올 정보
        // 뒤쪽은 value로 사용할 정보
        Map<Integer, Person> p =
                new HashMap<Integer, Person>();

        for(int i = START; i < MAX; i++) {
            // put은 HashMap에 정보를 삽입하는 매서드
            p.put(i, new Person(
                    rand.nextInt(RANGE) + BIAS,
                    randName()
            ));
        }

        System.out.println(p);

        // HashMap에서 특정 인덱스의 원소 제거
        p.remove(4);
        // put()을 통해서 데이터 교체가 가능하다는 점
        p.put(3, new Person(
                3, "안녕"
        ));
        System.out.println(p);

        // Map.Entry를 사용하여 실제 HashMap에 있는 정보들을
        // 한개씩 얻어올 수 있다.
        // p.entrySet()이 정보를 한 개씩 준다(Hash 정보)
        // Hash 정보란 (Key, Value)로 구성된 데이터
        for(Map.Entry<Integer, Person> s: p.entrySet()) {
            // getKey()를 통해서 key값을 얻는다.
            Integer key = s.getKey();
            // getValue()를 통해서 value값을 얻는다.
            Person value = s.getValue();
            System.out.println(
                    "key = " + key + "\nvalue = " + value
            );
        }
    }
}
