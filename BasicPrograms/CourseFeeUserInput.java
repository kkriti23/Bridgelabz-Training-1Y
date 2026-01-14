import java.util.Scanner;
public class CourseFeeUserInput{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	float fee = sc.nextFloat();
	float discountPercent = 10;
	float discount = fee*(discountPercent/100);
	float final_fee = fee - discount;
	System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+final_fee);
}
}