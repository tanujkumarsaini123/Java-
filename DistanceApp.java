import java.util.Scanner;
public class DistanceApp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter x1 and y1: ");
double x1 = sc.nextDouble();
double y1 = sc.nextDouble();

System.out.print("Enter x2 and y2: ");
double x2 = sc.nextDouble();
double y2 = sc.nextDouble();

Point p1 = new Point(x1, y1);
Point p2 = new Point(x2, y2);

System.out.println("\nPoints:");
p1.display();
p2.display();

double dist = Point.distance(p1, p2);
System.out.printf("%nDistance between points: %.2f%n", dist);
sc.close();
}
System.out.println("Tanuj kumar Saini 24csu347");
}