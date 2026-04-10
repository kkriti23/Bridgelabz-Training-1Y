package recursion;
import java.lang.Math;
import java.util.Scanner;

public class Armstrong {
    static long unit(long n){
        if(n==0) return 0;
        return 1 + unit(n/10);
    }
    static long armstrong(long n , long digits){
        if(n==0) return 0;
        //long rem = n%10;
        return (long)Math.pow(n%10,digits) + armstrong(n/10, digits);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long z = armstrong(n , unit(n));
        if(n==z)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
