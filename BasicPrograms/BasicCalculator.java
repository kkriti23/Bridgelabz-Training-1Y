import java.util.Scanner;
public class BasicCalculator{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Number1 : ");
	double Number1 = sc.nextFloat();
	System.out.print("Number2 : ");
	double Number2 = sc.nextFloat();
	double add = Number1 + Number2;
	double sub = Number1 - Number2;
	double pro = Number1 * Number2;
	double div = Number1 / Number2;
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+Number1+" and "+Number2+" is "+add+","+sub+","+pro+",and "+div);
}
}