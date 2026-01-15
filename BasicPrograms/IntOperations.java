import java.util.Scanner;
public class IntOperations{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("First number : ");
	int a = sc.nextInt();
	System.out.print("Second number : ");
	int b = sc.nextInt();
	System.out.print("Third number : ");
	int c = sc.nextInt();
	int A = a+b*c;
	int B = a*b+c;
	int C = c+a/b;
	int D = a%b+c;
	System.out.println("The results of Int Operations are "+A+","+B+","+C+",and "+D);
}
}