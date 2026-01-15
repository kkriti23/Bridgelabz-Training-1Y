import java.util.Scanner;
public class TotalHandshakes{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("No. of students : ");
	float n = sc.nextFloat();
	float handshakes = (n * (n - 1)) / 2;
	System.out.println("Toatal no of hanshakes are "+handshakes+" if total students are "+n);
}
}