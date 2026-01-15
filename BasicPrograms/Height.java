import java.util.Scanner;
public class Height{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Height in cm : ");
	double height = sc.nextFloat();
	double inInch = height / 2.54;
	double inFoot = inInch / 12;
	System.out.println("Your Height in cm is "+height+" while in feet is "+inFoot+" and inches is "+inInch);
}
}