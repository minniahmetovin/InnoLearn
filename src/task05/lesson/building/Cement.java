package task05.lesson.building;

class Cement extends Material {

    private int volume;

    Cement(int volume, int cost) {
        super(cost);
        this.volume = volume;
    }

    @Override /*с @ начинаются аннотации, в данном случае означает, что метод переопределен
                и тесно связан с методом суперкласса*/
    int getCost() {
        return super.getCost() * volume;
    }
}
