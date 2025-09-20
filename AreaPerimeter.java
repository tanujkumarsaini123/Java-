class Triangle {
int a, b, c;
Triangle() {
a = 3;
b = 4;
c = 5;
}
int Perimeter() {
return a + b + c;
}
double Area() {
double s = (a + b + c) / 2.0;
return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}
}
public class AreaPerimeter {
public static void main(String[] args) {
Triangle t = new Triangle();
System.out.println("Perimeter: " + t.Perimeter());
System.out.println("Area: " + t.Area());
System.out.println("Tanuj kumar Saini 24csu347");
}
}