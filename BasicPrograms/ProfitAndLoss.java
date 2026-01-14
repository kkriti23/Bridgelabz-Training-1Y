public class ProfitAndLoss{
public static void main(String[] args){
	float sp = 191;
	float cp = 129;
	float profit = sp - cp;
	float profit_percentage = (profit/cp)*100;
	System.out.println("The Cost Price is INR "+cp+"and Selling Price is INR "+sp);
	System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profit_percentage);
	}
}