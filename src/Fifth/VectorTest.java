package Fifth;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        System.out.println("size of Vector: " + v.size());

        v.addElement(new String("C"));
        v.addElement(new String("C++"));
        v.addElement(new String("Golang"));
        v.addElement(new String("Rust"));
        v.addElement(new String("Java"));
        v.addElement(new String("JavaScript"));
        System.out.println("size of Vector: " + v.size());

        for(int i = 0; i < v.size(); i++) {
            String tmp = v.elementAt(i);
            System.out.println(
                    "Vector v의 " + i +"번째: " + tmp
            );
        }
    }
}
