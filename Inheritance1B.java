interface Shape {
    void draw();
}

interface Circle extends Shape {
    void area();
}

class CircleImpl implements Circle {
    public void draw() {
        System.out.println("Drawing Circle");
    }
    public void area() {
        System.out.println("Area of Circle = pi*r^2");
    }
}

public class Inheritance1B {
    public static void main(String[] args) {
        CircleImpl c = new CircleImpl();
        c.draw();
        c.area();
    }
}
