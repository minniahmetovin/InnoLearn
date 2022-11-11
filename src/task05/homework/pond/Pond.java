package task05.homework.pond;

public class Pond { //пруд
    private Tadpole[] tadpoles;

    public Pond() {
        tadpoles = new Tadpole[3];
        tadpoles[0] = new Tadpole(10);
        tadpoles[1] = new Frog(5, 5);
        tadpoles[2] = new Fish(5, 4, 5);
    }

    private int getQuantity() {
        int x = 4;
        for (Tadpole t : tadpoles) {
            x += t.quantity;
        }
        return x; //подсчитано количество до нереста
    }

    public int getCustomerQuantity() {
        return getQuantity() * 3; //подсчитано количество после нереста
    }
}


