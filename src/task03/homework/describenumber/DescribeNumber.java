package task03.homework.describenumber;

import java.util.Scanner;

public class DescribeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        long input1 = scanner.nextInt();
        if (input1 < 0){
            System.out.println("Число отрицательное");
        }
        if (input1 > 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число нулевое");
        }
        if (input1 % 2 == 0){
            System.out.println("Число четное");
        }else {
            System.out.println("Число нечетное");
        }
    }
}
