package functionalInterface;

public class Product implements Calculator{
    public int calculate(int a,int b){
        return a*b;
    }
    static void main() {
        Calculator pro = new Product();
        int val = pro.calculate(1,5);
        System.out.println(val);
    }
}
