import java.util.Scanner;
public class KilometerToMiles{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Kilometer to be converted : ");
int km = scanner.nextInt();
double miles = (km * 0.621371);
System.out.println("miles : " + miles);
scanner.close();
}
}