package generic;

import java.util.List;

public class Main {
    //non static method generic
    public <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }
    //static method generic
    public static <T extends Number> void printNumbers(List<T> list){             //upper bound generic
        for(T num : list){
            System.out.println(num);
        }
    }


}
