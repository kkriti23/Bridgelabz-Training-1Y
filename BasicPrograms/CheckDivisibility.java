import java.util.Scanner;
public class CheckDivisibility{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int number = sc.nextInt();
	System.out.println("Is the number "+number+" dividible by 5 ?");
	if(number%5==0){
		System.out.println("YES");
	}else{
		System.out.println("NO");
	}
}
}