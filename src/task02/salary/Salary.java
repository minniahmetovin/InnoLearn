package task02.salary;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько начисляет работодатель до налогового вычета?");
        double tax = 0.87;
        System.out.println("Зарплата на руки " + scanner.nextInt()*tax + " рублей");
    }
}