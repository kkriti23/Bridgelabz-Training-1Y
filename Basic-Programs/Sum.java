import java.util.Scanner;
public class Sum{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number : ");
int x = scanner.nextInt();
System.out.print("Enter second number : ");
int y = scanner.nextInt();
int sum = x + y;
System.out.println("Sum : " + sum);
}
}