import java.util.Scanner;
public class AreaCircle{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Radius : ");
int radius = scanner.nextInt();
float Area = (22/7)*(radius*radius);
System.out.println("Area of Circle : " + Area);
}
}