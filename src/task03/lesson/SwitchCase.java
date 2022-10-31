package task03.lesson;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {//может принимать enum, строки, примитивные типы и обёртки над ними (принял примитивный тип)
            case 0:
                System.out.println("0");
                break; // если он пропущен, работает до первого break
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Какое-то другое значение");
        }
        String string = "Hey you!";
        switch (string){ //принял строку
            case "Hare Krishna":
                System.out.println("Hare Rama");
                break;
            case "Hey you!":
            default:
                System.out.println("Touch me!");
        }
    }
}
