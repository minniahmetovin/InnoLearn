package task05.homeworkrepeat.lanka;

class Yaksha extends Demon {
    long quantity;
    long power = 500;
    long health = 500;


    public long getQuantity() {
        return quantity;
    }

    public Yaksha(long quantity, long power, long health) {
        this.quantity = quantity;
        this.power = power;
        this.health = health;
    }
}
