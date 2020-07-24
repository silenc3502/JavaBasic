package Prob;

// Non Array Version
// 1 1 2 3 5 8 13
class Fib {
    private int first;
    private int second;
    private int res;

    final int START = 2;

    public int calcNFib(int n) {
        int tmp;

        first = 1;
        second = 1;
        res = 0;

        if(n < 2) {
            return 1;
        }

        // first + second = res
        // second + res   = next_res
        // res + next_res = nn_res
        for(int i = START; i < n; i++) {
            tmp = first;
            first = second;
            res = first + tmp;
            second = res;
        }

        return res;
    }
}

public class FibProb {
    public static void main(String[] args) {
        Fib fib = new Fib();
        // 1 1 2 3 5 8 13 21 34 55
        System.out.println(fib.calcNFib(3));
        System.out.println(fib.calcNFib(5));
        System.out.println(fib.calcNFib(6));
        System.out.println(fib.calcNFib(8));
    }
}
