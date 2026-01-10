import java.util.Scanner;
public class PerimeterOfRectangle{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Lenght : ");
int lenght = scanner.nextInt();
System.out.print("Enter Breadth : ");
int breadth = scanner.nextInt();
float perimeter = 2*(lenght+breadth) ;
System.out.println("Perimeter of rectangle : " + perimeter);
}
}