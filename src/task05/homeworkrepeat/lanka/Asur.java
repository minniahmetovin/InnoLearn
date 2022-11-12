package task05.homeworkrepeat.lanka;

class Asur extends Demon {
    private long power = 1000;
    private long health = 1000;

    Asur(long quantity, long power, long health) {
        super(quantity);
        this.power = power;
        this.health = health;
    }

    @Override
    public long getQuantity() {
        return super.quantity * power * health;
    }
}