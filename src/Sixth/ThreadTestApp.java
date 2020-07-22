package Sixth;

import java.util.Random;

class Car implements Runnable {
    String name;
    private int sleepTime;
    private final static Random gen = new Random();

    public Car(String name) {
        this.name = name;
        sleepTime = gen.nextInt(3000);
    }

    // Runnable을 implements 했다면
    // 반드시 필요한 요소가 바로 public void run()이다.
    // 이 녀석을 우리가 직접 코드 작성하지 않는다면 오류가 나타난다.
    public void run() {
        try {
            // 현재 스레드로 구동되는 객체를
            // 강제로 sleepTime만큼 sleep 시킨다.
            // 단위는 ms(0.001초) 단위에 해당한다.
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {

        }

        System.out.println(name + "이(가) 경주를 완료하였다.");
    }
}

public class ThreadTestApp {
    public static void main(String[] args) {
        // Thread를 사용하려면 아래와 같이
        // 스레드 객체가 될 대상을 지정해야 한다.
        // 추가로 스레드가 될 대상 객체는
        // 반드시 Runnable을 implements 해야 한다.
        // 그래야 Thread를 구동시킬 수 있기 때문이다.
        Thread t1 = new Thread(new Car("Porsche 918"));
        Thread t2 = new Thread(new Car("Ferrari"));
        Thread t3 = new Thread(new Car("Nissan"));

        // 위에서 만들어놓은 스레드 객체들을
        // 아래 start()를 통해서 구동하기 시작한다.
        // 이때부터 CPU를 획득하기 위해 경합을 벌인다.
        t1.start();
        t2.start();
        t3.start();
    }
}
