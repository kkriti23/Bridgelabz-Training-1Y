import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Rate : ");
int rate = scanner.nextInt();
System.out.print("Enter Principle : ");
int principle = scanner.nextInt();
System.out.print("Enter Time : ");
int time = scanner.nextInt();
float SI = (principle*rate*time)/100;
System.out.println("Simple Interest : " + SI);
}
}