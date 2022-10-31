package task03;

import org.w3c.dom.ls.LSOutput;

public class Conditions {
    public static void main(String[] args) {
        boolean op1 = true;
        boolean op2 = false;
        if (op1 == op2 || op1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    static boolean odd(int a) {
        System.out.println("odd(" + a + ")");
        return a % 2 == 0; //четное или не четное

    }

    static boolean greaterThan100(int a) {
        System.out.println("greaterThan100" + a + ")");
        return a > 100; //число больше 100
    }
    int a=odd(3)?100:200; // тренарный оператор
}

