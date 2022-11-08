package task05.lesson.building;

class Glass extends Material {

    private int width;

    private int height;

    Glass(int width, int height, int cost) {
        super(cost);
        this.width = width;
        this.height = height;
    }

    @Override /*с @ начинаются аннотации, в данном случае означает, что метод переопределен
                и тесно связан с методом суперкласса*/
    int getCost() {
        return super.cost * width * height;
    }

}
