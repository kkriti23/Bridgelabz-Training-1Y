import java.util.Scanner;
public class CelsiusToFahrenheitConversion{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Temperature in Fahrenheit : ");
float Celsius = scanner.nextFloat();
float Fahrenheit = (Celsius * 9/5) + 32;
System.out.println("Temperature in Fahrenheit : " + Fahrenheit );
}
}