package task06.lesson.figure;

public class Rectangle implements Resizable, Drawable {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }

    @Override
    public void resize() {
        System.out.println("resize rectangle");

    }
}
