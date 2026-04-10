package functionalInterface;

public class xyx {
    static boolean calculate(Calculator impl , int a, int b){
        impl.calculate(a,b);
    }

    static void main() {
        Calculator sum = (a,b) -> a+b;
        Calculator pro = (a,b) -> a*b;
        Calculator div = (a,b) -> a/b;
    //    sum.calculate(1,5);
        System.out.println(calculate(sum,1,5));
        calculate(pro,1,5);
        calculate(div,10,5);
    }
}
