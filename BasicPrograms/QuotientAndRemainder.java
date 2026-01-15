import java.util.Scanner;
public class QuotientAndRemainder{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Number 1 : ");
	float number1 = sc.nextFloat();
	System.out.print("Number 2 : ");
	float number2 = sc.nextFloat();
	float quotient = (number2/number1);
	float remainder = number2%number1;
	System.out.println("The quotient is "+quotient+" and remainder is "+remainder+" of two number "+number1+" and "+number2);
}
}