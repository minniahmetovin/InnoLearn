package task01;

public class SecToHour {
    public static void main(String[] args) {
        double sec = 100000000;
        int sih = 60*60;
        double hour = sec/sih;
        System.out.println("Часов в этих секунда: " + hour);
    }
}
