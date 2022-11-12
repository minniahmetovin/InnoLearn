package task05.homeworkrepeat.lanka;

public class Demon {

    long quantity;
    public Demon(long quantity){
        this.quantity = quantity;
    }

    public Demon() {
        return;
    }

    public long getQuantity(){
        return quantity;
    }
    public long getQuantityAfterFight() {
        return getQuantity() * 0;
    }
//    Demon[] demons;
//
//    public Demon() {
//        demons = new Demon[2];
//        demons[0] = new Demon();
//        demons[0].quantity = 100000000;
//        demons[1] = new Demon();
//        demons[1].quantity = 10000000;
//    }
//
//    public long getQuantity() {
//        long sum = 0;
//        for (Demon a : demons) {
//            sum += a.quantity();
//        }
//        return sum;
//    }
//
//    public long getQuantityAfterFight() {
//        return getQuantity() * 0;
//    }

}
