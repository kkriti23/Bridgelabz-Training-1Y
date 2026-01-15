import java.util.Scanner;
public class TotalPrice{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("unit price of the item : ");
	float unitPrice = sc.nextFloat();
	System.out.print("Quantity : ");
	float quantity = sc.nextFloat();
	float totalPrice = unitPrice * quantity;
	System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is "+unitPrice);
}
}