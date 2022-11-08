package task05.lesson.building;

public class Building {
    private Material[] materails;

    public Building() {
        materails = new Material[3];
        materails[0] = new Material(1000);
        materails[1] = new Glass(2,2, 100);
        materails[2] = new Cement(2,10);
    }

    private int getPrice() {
        int sum = 0;
        for (Material m : materails) {
            sum += m.getCost();
        }
        return sum; //подсчитана себестоимость
    }

    public int getCustomerPrice() {
        return getPrice() * 2; //подсчитано с накруткой х2
    }
}
