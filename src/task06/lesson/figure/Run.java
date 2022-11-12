package task06.lesson.figure;

public class Run {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        draw(rectangle);
        draw(circle);
        resize(rectangle);
        resize(circle);
    }

    public static void draw(Drawable drawable){
        drawable.draw();
    }

    public static void resize(Resizable resizable){
    resizable.resize();
    }
}
