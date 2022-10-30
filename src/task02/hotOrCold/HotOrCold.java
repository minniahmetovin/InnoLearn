package task02.hotOrCold;

import java.util.Random;
import java.util.Scanner;

public class HotOrCold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();
        final int random = random1.nextInt((100 - 1) + 1) + 1;
        System.out.println("Введи любое число");
        int input = scanner.nextInt();
        int value = 0;
        while (input != 101 && input != random) {
            if (
                    value < Math.abs(input - random)
            ) {
                System.out.println("Холодно");
            } else {
                System.out.println("Горячо");
            }
            value = Math.abs(input - random);
            input = scanner.nextInt();
        }
        if (input == random) {
            System.out.println("Ты угадал");
        }
    }
}

