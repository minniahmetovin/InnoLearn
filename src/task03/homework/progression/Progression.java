package task03.homework.progression;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое число");
        int i = scanner.nextInt();
        System.out.println("Введи знаменатель");
        int a = scanner.nextInt();
        int z = 1;
        for (int y = 1; y < 11; y++) {
//            for (int k = 0; k <= y - 1; k++) {
//                z = z * a;
//            }
            System.out.println(i * (int)Math.pow(a,y-1));
//            z = 1;
        }

    }
}
