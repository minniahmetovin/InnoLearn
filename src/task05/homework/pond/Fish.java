package task05.homework.pond;

public class Fish extends Tadpole { //рыбка наследуется от головастика
    private int length;

    private int width;

    Fish(int quantity, int length, int width) {
        super(quantity);
        this.quantity = quantity;
        this.length = length;
        this.width = width;
    }

    @Override
    int getQuantity() {
        return super.getQuantity() * length * width;
    }
}