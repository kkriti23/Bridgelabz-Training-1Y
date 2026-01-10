import java.util.Scanner;
public class Average{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number : ");
int x = scanner.nextInt();
System.out.print("Enter second number : ");
int y = scanner.nextInt();
System.out.print("Enter third number : ");
int z = scanner.nextInt();
float avg = (x+y+z)/3;
System.out.println("Average : " + avg);
}
}