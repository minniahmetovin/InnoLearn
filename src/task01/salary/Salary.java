package task01.salary;

public class Salary {
    public static void main(String[] args) {
        long salary = 1000009809;
        long tax = salary * 13/100;
        long income = salary - tax;
        System.out.println("Зарплата на руки " + income  + " рублей");
    }
}