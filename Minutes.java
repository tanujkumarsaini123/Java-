//Take input in minutes  

import java.util.Scanner;
class Minutes
{ 
public static void main(String[] arg) 
{ 
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a in minutes");
double a =scan.nextDouble(); 
double day=a/(60*24); 
double month=day/30;
double year=month/12; 
System.out.println("days are"+day); 
System.out.println("month are"+month); 
System.out.println("years are" +year);
System.out.println("Tanuj kumar Saini 24csu347");
}
}