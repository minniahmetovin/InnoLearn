package task01.salary;

public class Salary {
    public static void main(String[] args) {
        double salary = 100000.87;
        double tax = salary * 13/100;
        double income = salary - tax;
        System.out.println("Зарплата на руки " + income  + " рублей");
    }
}