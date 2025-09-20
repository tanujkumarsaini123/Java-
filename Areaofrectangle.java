import java.util.Scanner;
class Area {
int length;
int breadth;
Area(int l, int b) {
length = l;
breadth = b;
}
int returnArea() {
return length * breadth;
}
}
public class Areaofrectangle {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of the rectangle: ");
int length = sc.nextInt();
System.out.print("Enter breadth of the rectangle: ");
int breadth = sc.nextInt();
Area rect = new Area(length, breadth);
System.out.println("Area of the rectangle: " + rect.returnArea());
System.out.println("Tanuj kumar Saini 24csu347");
sc.close();
}
}