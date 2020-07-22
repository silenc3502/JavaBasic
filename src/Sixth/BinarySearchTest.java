package Sixth;

// 1 + 2 + 4 + 8 + 16 = 32 - 1
// 1 + 2 + 4 + 8      = 16 - 1
// 1 + 2 + 4          = 8  - 1
// 1 + 2              = 4  - 1
// 1                  = 2  - 1

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 트리 - 일반 트리, AVL 트리, RB 트리, B 트리, A-Star
//                 50            2^0
//            25         75      2^1
//        10    30    60    80   2^2
//       5 12 27 31 55 63 77 88  2^3
//    .......................    ...
//                               2^n
public class BinarySearchTest {
    public static void main(String[] args) {
        int key = 50;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++) {
            list.add(i);
        }

        int idx = Collections.binarySearch(list, key);
        System.out.println("탐색값: " + idx);
    }
}
