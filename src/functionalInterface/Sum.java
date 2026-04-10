package functionalInterface;

public class Sum implements Calculator{
    public int calculate(int a, int b){
        return a+b;
    }

    static void main() {
        Calculator sum = new Sum();
        int val = sum.calculate(1,5);
        System.out.println(val);
    }
}
