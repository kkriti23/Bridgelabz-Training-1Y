package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wildcard {
    public static void printNumbersWildCard(List<? extends Number> list) {
        //list.add(20);
        List<? extends Number> list2 = new ArrayList<Integer>();
        //list2.add(3.14);
        List<? super Number> list3 = new ArrayList<Object>();
        list3.add(42);
        list3.add(3.34);
        System.out.println(list3);
        // List<T super Number> list4 = new ArratList<Object>();
        for(Number num : list){
            System.out.println(num.doubleValue());
        }
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        List list = new ArrayList();
    }
}
