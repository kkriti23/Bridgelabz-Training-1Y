import java.util.Scanner;
public class Power{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Base : ");
int base = scanner.nextInt();
System.out.print("Enter Power : ");
int power = scanner.nextInt();
double Result = Math.pow(base,power);
System.out.println("Power Calculation : " + Result);
scanner.close();
}
}