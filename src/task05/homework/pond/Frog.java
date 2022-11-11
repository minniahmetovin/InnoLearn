package task05.homework.pond;

public class Frog extends Tadpole { //лягушка наследуется от головастика

    int weight;


    Frog(int quantity, int weight) {
        super(quantity);
        this.weight = weight;
    }

    @Override
    int getQuantity() {
        return super.getQuantity() * weight;
    }
}