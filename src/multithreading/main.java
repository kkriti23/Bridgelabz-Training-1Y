package multithreading;

public class main {
    static void main() {
        StringBuffer s1 = new StringBuffer("BCD");
        s1.append("BCD");
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("BCD");
        s2.append("BCD");
        System.out.println(s2);
    }


}
