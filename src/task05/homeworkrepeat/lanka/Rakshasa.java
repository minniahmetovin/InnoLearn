package task05.homeworkrepeat.lanka;

public class Rakshasa extends Demon {
    long quantity;
    long power = 100;
    long health = 100;

    public Rakshasa(long quantity, int power, int health) {
        super(quantity);
        this.power = power;
        this.health = health;
    }
}

