import java.util.Scanner;
public class DistanceInYardAndMile{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Distance in feets : ");
	float feet = sc.nextFloat();
	float yard = feet/3;
	float miles = yard/1760;
	System.out.println(feet+" feet in yard is "+yard+" and in miles is "+miles);
}
}