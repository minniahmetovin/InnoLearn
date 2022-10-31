package task03.homework.minnumber;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int input1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int input2 = scanner.nextInt();
        if (input1 < input2) {
            System.out.println("Второе число больше");
        }
        if (input1 > input2) {
            System.out.println("Первое число больше");
        } else {
            System.out.println("Числа равны");
        }

    }
}
