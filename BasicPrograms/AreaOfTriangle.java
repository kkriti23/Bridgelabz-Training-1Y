import java.util.Scanner;
public class AreaOfTriangle{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("base in cm: ");
	double  base= sc.nextDouble();
	System.out.print("height in cm: ");
	double height = sc.nextDouble();
	double area_cm = (0.5)*base*height;
	double area_inches = area_cm /(6.4516);
	System.out.println("Area of triangle in cm is "+area_cm+" cm and in inches is "+area_inches+"inches");
}
}