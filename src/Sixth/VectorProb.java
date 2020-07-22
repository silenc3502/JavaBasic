package Sixth;

import java.util.Random;
import java.util.Vector;

class ProbSupporter {
    Random rand;
    Vector<Integer> elem;
    Vector<Integer> freq;

    final int START = 0;
    final int MAX = 200;
    final int BIAS = 10;
    final int RANGE = 51;

    public ProbSupporter() {
        rand = new Random();
        elem = new Vector<Integer>();
        freq = new Vector<Integer>();

        for(int i = START; i < MAX; i++) {
            // 원소 추가(addElement())
            elem.addElement(rand.nextInt(RANGE) + BIAS);
        }

        System.out.println("elem Size: " + elem.size());

        for(int i = START; i < RANGE; i++) {
            freq.addElement(0);
        }

        System.out.println("freq Size: " + freq.size());
    }

    public void calcFreq() {
        int idx, tmp;

        for(int i = START; i < MAX; i++) {
            // 특정 인덱스의 원소 가져오기(elementAt())
            idx = elem.elementAt(i) - 10;
            tmp = freq.elementAt(idx);

            // 특정 위치의 원소 변경(setElementAt())
            freq.setElementAt(
                    ++tmp /* 현재의 값 + 1 */,
                    idx /* 인덱스 */
            );
        }
    }

    @Override
    public String toString() {
        int cnt = 0;
        String retStr = "elem = \n[";
        String freqStr = "freq = \n[";

        for(int i = START; i < MAX; i++) {
            retStr += elem.elementAt(i);

            if(i != MAX - 1) {
                retStr += ", ";
            } else {
                retStr += "]";
            }
            // 보기 예쁘게 10개 단위로 끊어줄 필요가 있다.
            if(++cnt % 10 == 0) {
                retStr += "\n ";
            }
        }

        for(int i = START; i < RANGE; i++) {
            freqStr += freq.elementAt(i);

            if(i != RANGE - 1) {
                freqStr += ", ";
            } else {
                freqStr += "]";
            }
            // 보기 예쁘게 10개 단위로 끊어줄 필요가 있다.
            if(++cnt % 10 == 0) {
                freqStr += "\n ";
            }
        }

        return retStr + freqStr;
    }
}

public class VectorProb {
    public static void main(String[] args) {
        ProbSupporter ps = new ProbSupporter();
        ps.calcFreq();

        System.out.println(ps);
    }
}
