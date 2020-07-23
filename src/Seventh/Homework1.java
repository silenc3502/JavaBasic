package Seventh;

import java.util.Arrays;

// 문제를 풀기위해 어떠한 요소들이 필요한가 ?
// 1. 미소값(dx)의 기준이 필요하다.
// 2. 값을 저장해야하므로 배열을 활용해야 한다.
// 3. for문을 돌 필요가 있다.
// 4. 각 for문 마다 현재 x값을 조정하며 y값을 계산해야 한다.
// 5. dx값과 계산한 y값의 곱을 통해 면적을 구하고
// 6. 이 값을 전부 합산하면 적분이 완료된다.
class Integral {
    private final float DX = 0.00001f;

    private float[] y;
    private float res;
    private int loopNum;

    private float start, end;

    public Integral(float start, float end) {
        this.start = start;
        this.end = end;

        loopNum = findLoopNum();

        y = new float[loopNum];
    }

    private int findLoopNum() {
        // Math.round() 반올림
        return (int)Math.round((end - start) / DX);
    }

    public float calcIntg() {
        float res = 0;
        float curX = 0;

        System.out.println(loopNum);

        // [e^x] 0 ~ 3 => e^3 - 1
        for(int i = 0; i < loopNum; i++) {
            y[i] = (float)Math.exp(curX);
            curX += DX;
            //System.out.println(curX);
            res += DX * y[i];
        }

        return res;
    }

    @Override
    public String toString() {
        return "Integral{" +
                "DX=" + DX +
                ", y=" + Arrays.toString(y) +
                ", res=" + res +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}

// 1. 자바로 y = exp(x) 정적분을 구현해보자 ~
public class Homework1 {
    public static void main(String[] args) {
        Integral intg = new Integral(0, 3);
        System.out.println(intg);

        System.out.println(intg.calcIntg());
    }
}
