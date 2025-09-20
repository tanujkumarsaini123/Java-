//convert F to C 
//Tanuj kumar Saini 24csu347
import java.util.Scanner; 
class Temperature
{ 
public static void main(String arg[]) 
{
Scanner scan=new Scanner(System.in); 
System.out.println("enter temp in F");
double F=scan.nextDouble(); 
double C= 0;
C = (F-32)*5/9;
System.out.println("temp in C is"+C); 
System.out.println("tanuj kumar saini 24csu347");
}
}